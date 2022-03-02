package com.sykj.edu.controller;

import com.alibaba.fastjson.JSONObject;
import com.sykj.edu.dao.FZCSFDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @User: guohaotian
 * @Date: 2022/2/28 15:39
 * @package_Name: com.sykj.edu.controller
 * @Class_Name: FZCSFController
 * To change this template use File | Settings | File Templates.
 */
@RequestMapping("FZCSF")
@Controller
public class FZCSFController {
    @Autowired
    private FZCSFDao dao;

    /**
     * 待办列出需要当前操作人员进行办理的事项（排除属性类型为：非正常上访、敏感时期上访）
     * */
    @RequestMapping("XFCL")
    @ResponseBody
    public Object FindAll(Integer userId, String letterTitlef, String letterNamef, String registerTimef,Integer page,Integer limit){
        List list = dao.FindAll(userId, letterTitlef, letterNamef, registerTimef, page, limit);
        return list;
    }

    /**
     * 信访人基本信息
     * */
    @RequestMapping("XFRXX")
    @ResponseBody
    public Object FindApp(Integer idf){
        Object o = dao.FindApp(idf);
        return o;
    }

    /**
     * 基础信息
     * */
    @RequestMapping("JCXX")
    @ResponseBody
    public Object FindJCXX(String baseValue){
        Object o = dao.FindBasic(baseValue);
        return o;
    }

    /***
     *批示领导 受信人
     */
    @RequestMapping("SysUser")
    @ResponseBody
    public Object FindAllSysUser(){
        Object o = dao.FindSysUser();
        return o;
    }

    /**
     * 文件上传
     */
    @RequestMapping("fileUpload")
    @ResponseBody
    public JSONObject fileUpload(HttpServletRequest request){
        CommonsMultipartResolver multipartResolver =
                new CommonsMultipartResolver(request.getSession().getServletContext());
        //检查form中是否有enctype="multipart/form-data"
        JSONObject jsonObject = new JSONObject();
        if(multipartResolver.isMultipart(request)) {
            //将request变成多request
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest)request;
            //获取multiRequest中所有的文件名
            Iterator iter = multiRequest.getFileNames();
            while(iter.hasNext()){
                //一次遍历所有的文件
                MultipartFile file = multiRequest.getFile(iter.next().toString());
                //得到上传的文件名
                String originalFilename = file.getOriginalFilename();
                if(null!= file && file.getSize()>20*1024*1024) {
                    jsonObject.put("msg", "传输文件过大，上传失败！");
                } else if( file != null ){
                    try {
                        //得到服务器的路径, getRealPath:返回一个指定虚拟路径的真实路径（完整路径）的字符串,构建文件路径
                        String path =request.getServletContext().getRealPath("/")+"File\\"+originalFilename;
                        File f=new File(path);
//                        不存在就创建
                        if(!f.exists()){
                            f.mkdirs();
                        }
                        //保存文件到服务器
                        //将文件上传保存指定文件
                        file.transferTo(f);
                        jsonObject.put("msg", "上传成功!");
                        jsonObject.put("success", true);
                        jsonObject.put("fileSize", file.getSize());
                        jsonObject.put("fileName", originalFilename);
                        jsonObject.put("pathName", path);
                    } catch (Exception e) {
                        jsonObject.put("msg", "未知异常!");
                    }
                }
            }
        }
        return jsonObject;
    }


    /**
     * 增加附件信息
     * */
    @RequestMapping("InsertAcc")
    @ResponseBody
    public Object InsertAcc(Integer idf,String aname,Integer asize,String atype,String path,Integer userid){
        int i = dao.InsertAcc(idf, aname, asize, atype, path, userid);
        return i;
    }


    /**
     * 查询附件信息
     * */
    @RequestMapping("FindAcc")
    @ResponseBody
    public Object FindAcc(Integer idf,Integer page,Integer limit){
        Object o = dao.FindAccessories(idf, page, limit);
        return o;
    }


    /**
     * 查询审批流程
     * */
    @RequestMapping("FindLC")
    @ResponseBody
    public Object Find(Integer idf,Integer page,Integer limit){
        Object o = dao.FindLC(idf, page, limit);
        return o;
    }


    /**
     * 查询所有部门
     * */
    @RequestMapping("Department")
    @ResponseBody
    public Object FindDepartment(){
        Object o = dao.FindAllDepartment();
        return o;
    }
    /**
     *根据部门id查询人员
     * */
    @RequestMapping("FindSysUser")
    @ResponseBody
    public Object FindSysUser(Integer did){
        Object o = dao.FindSysUser(did);
        return o;
    }


    /**
     * 根据流程id查询信访登记人
     * */
    @RequestMapping("FindLetterRegisterIdf")
    @ResponseBody
    public Object FindLetterRegisterIdf(Integer idf){
        Object o = dao.FindLetterRegisterIdf(idf);
        return o;
    }


    /**
     * 发送
     * */
    @RequestMapping("FS")
    @ResponseBody
    public Object UpdateApproveInfo(Integer idf,String suggestionContentf,Integer isAgreef,String letterPropertiesf,Integer isend,Integer personnel){
        Object o1 = dao.UpdateApproveInfo(idf, suggestionContentf, isAgreef, letterPropertiesf, isend, personnel);
        return o1;
    }
}
