package com.sykj.edu.controller;

import com.sykj.edu.dao.XFChaXunDao;
import com.sykj.edu.dao.XFDengJi_Dao;
import com.sykj.edu.vo.XFChaXun;
import com.sykj.edu.vo.XFDJVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping("XFDJ")
@Controller
public class XFDengJi_Controller {
    @Autowired
    private XFDengJi_Dao dao;
    @Autowired
    private XFChaXunDao dao2;

    /**
     * 信访查询
     * */
    @RequestMapping("findAll")
    @ResponseBody
    public Object findAll(XFChaXun xfChaXun) {
        Object all = dao2.findAll(xfChaXun);
        return all;
    }

    /**
     * 基础数据
     * **/
    @RequestMapping("FindAllBase")
    @ResponseBody
    public Object FINDBase(String baseValue){
        try {
            return dao.findBase(baseValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 组织部门
     * */
    @RequestMapping("department")
    @ResponseBody
    public Object FindDepartment(){
        return dao.FindAllDepartment();
    }

    /**
     * 领导
     * */
    @RequestMapping("FindSys_User")
    @ResponseBody
    public Object FindSys_User(){
        return dao.FindSys_user();
    }

    /**
     * 增加信访人信息
     * */
    @RequestMapping("InsertLettersInfo")
    @ResponseBody
    public Object InsertLettersInfo(XFDJVo abc){
        Integer isVIPf;
        System.out.println(abc.getLetterPropertiesf());
        //列入排查 领导包案 代接代访件 非正常上访  领导批示 敏感时期上访
        if(abc.getLetterPropertiesf().equals("敏感时期上访")||abc.getLetterPropertiesf().equals("非正常上访")){
//            非正常上访
            isVIPf=1;
        }else{
            //正常上访
            isVIPf=0;
        }
        abc.setIsVIPf(isVIPf.toString());
        int i = dao.addXFRXX(abc);
        if(isVIPf==1){
            int o = dao.InsertVIPManage(abc);
            if(o>0){
                return i;
            }else{
                return 0;
            }
        }
        return i;
    }
    
    //增加信访件信息
    @RequestMapping("InsertLetterbaseinfo")
    @ResponseBody
    public Object InsertLetterBaseinfo(XFDJVo xfxf){
        Integer state=0;
        if(xfxf.getIsRegist().equals(0)){
//            不立案
            state=0; //待办理
        }else if(xfxf.getIsRegist().equals(1)){
//            立案
            state=1;//办理中
        }
        xfxf.setState(state);
        int i = dao.InsertLetterbaseInfo(xfxf);
        if(xfxf.getIsRegist().equals(1)){
            int i1 = dao.InsertApproveInfo(xfxf);
            if(i1>0){
                return i;
            }else{
                return 0;
            }
        }
        return i;
    }

    /**
     *修改信访件信息
     * */
    @RequestMapping("UpdateLetterBaseInfo")
    @ResponseBody
    public Object UpdateLetterBaseInfo(XFDJVo vo){
        int i = dao2.UpdateLetterBaseInfo(vo);
        return i;
    }

    /**
     * 新增信访审批流程
     * */
    @RequestMapping("InsertApproveInfo")
    @ResponseBody
    public Object InsertApproveInfo(XFDJVo vo){
        int i = dao2.InsertApproveInfo(vo);
        return i;
    }
}