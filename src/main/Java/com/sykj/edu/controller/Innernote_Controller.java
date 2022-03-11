package com.sykj.edu.controller;



import com.sykj.edu.dao.Innernote_Dao;
import com.sykj.edu.util.VCommList;
import com.sykj.edu.vo.Innernote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @Date 2022/3/2 - 9:14
 */

@RequestMapping("Innernote_Controller")
@Controller
public class Innernote_Controller {
    @Autowired
    private Innernote_Dao innernote_dao;

    //查询显示
    @RequestMapping("/findAll")
    @ResponseBody
    public Object findAll(Innernote innernote){
        VCommList vCommList = innernote_dao.findAll(innernote);
        return vCommList;
    }
    //删除
    @RequestMapping("/del")
    @ResponseBody
    public Object del(Integer msgid){
        return innernote_dao.del(msgid);
    }

    //添加
    @RequestMapping("/add")
    @ResponseBody
    public Object add(Innernote innernote){
        return innernote_dao.add(innernote);
    }

    //查询所有消息类型
    @RequestMapping("/type")
    @ResponseBody
    public Object type(){
        return innernote_dao.typeAll();
    }

    //根据ID查询信息
    @RequestMapping("find")
    @ResponseBody
    public Object find(Integer msgid){
        return innernote_dao.find(msgid);
    }
}
