package com.sykj.edu.controller;

import com.sykj.edu.dao.FaceDao;
import com.sykj.edu.util.FaceSpot;
import com.sykj.edu.vo.FaceVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.misc.BASE64Decoder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @@Description:人脸操作
 * @User:guohaotian
 * @Date: 2022/3/5 9:04
 * @package_Name: com.sykj.edu.controller
 * @Class_Name: FaceController
 * To change this template use File | Settings | File Templates.
 */

@Controller
@RequestMapping("Face")
public class FaceController {
    @Autowired
    private FaceDao dao;

    @RequestMapping("LoginFace")
    @ResponseBody
//    登录
    public Object Login(String imagebase64) throws Exception{
//        查询所有已经录入人脸的用户信息
        List<FaceVo> list = dao.FindAll();

        //        替换掉前面的data:imgage/png;base64
        String str=imagebase64.replace("data:image/png;base64,","");
//        解码
        BASE64Decoder decoder = new BASE64Decoder();
//            转换为字节
            byte[] bytes = decoder.decodeBuffer(str);

        ArrayList userResult=new ArrayList();
        for(FaceVo fv:list){
            String s = FaceSpot.searchFace(bytes, fv.getBdy_groupName(), fv.getBdy_userId().toString());
            userResult.add(s);
        }
        return userResult;
    }

    /**
     * 查询uidf
     * */
    @RequestMapping("findUIDF")
    @ResponseBody
    public Object findUIDF(String bdy_userId){
        return dao.FindUidf(bdy_userId);
    }

    /**
     * 是否已经录入人脸
     * */
    @RequestMapping("FindUser")
    @ResponseBody
    public Object isFaceEmpty(String uidf){
        FaceVo faceEmpty1 = dao.isFaceEmpty(uidf);
        if(faceEmpty1==null){
            return false;
        }else{
            return true;
        }
    }


    /**
     * 录入人脸
     * 流程：先跟人脸库所有比对一下看是否存在不存在的话在让录入人脸
     * **/
    @RequestMapping("InsertFace")
    @ResponseBody
    public Object InsertFace(String imagebase64,String uidf){
        //        替换掉前面的data:imgage/png;base64
        String str=imagebase64.replace("data:image/png;base64,","");
//        解码
        BASE64Decoder decoder = new BASE64Decoder();
        try {
            //            转换为字节
            byte[] bytes = decoder.decodeBuffer(str);
//                新增人脸
                String s = FaceSpot.addUser(bytes, "", uidf,"face1");
                return s;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

//    人脸录入成功向数据库新增一条数据
    @RequestMapping("InsertDatabase")
    @ResponseBody
    public Object InsertDataBase(String uidf){
        int i = dao.insertFace(uidf);
        return i;
    }

    /**
     * 人脸更新流程：
     * 查看与原录入人脸是否相同，相同则让录入，不相同则不让更新
     * */
    @RequestMapping("isTong")
    @ResponseBody
    public Object isTong(String imagebase64,String uidf){
        //        替换掉前面的data:imgage/png;base64
        String str=imagebase64.replace("data:image/png;base64,","");
//        解码
        BASE64Decoder decoder = new BASE64Decoder();
        try {
            //            转换为字节
            byte[] bytes = decoder.decodeBuffer(str);
//               查看是否与原录入人脸相同
            String face1 = FaceSpot.searchFace(bytes, "face1", uidf);
            return face1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    @RequestMapping("UpdateFace")
    @ResponseBody
    public Object UpdateFace(String uidf,String imagebase64){
//        替换掉前面的data:imgage/png;base64
        String str=imagebase64.replace("data:image/png;base64,","");
//        解码
        BASE64Decoder decoder = new BASE64Decoder();
        try {
            //            转换为字节
            byte[] bytes = decoder.decodeBuffer(str);
//               查看是否与原录入人脸相同
            String face1 = FaceSpot.updateUser(bytes,"", "face1", uidf);
            return face1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

}
