package com.sykj.edu.controller;


import com.sykj.edu.dao.Inform_Dao;
import com.sykj.edu.util.VCommList;
import com.sykj.edu.vo.Inform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Date 2022/2/28 - 20:38
 */

@RequestMapping("Inform_Controller")
@Controller
public class Inform_Controller {

    @Autowired
    private Inform_Dao id;

    //查询显示
    @RequestMapping("/findAll")
    @ResponseBody
  public Object findAll(Inform inform){
        VCommList list = id.findAll(inform);
        return list;
    }

    //删除
    @RequestMapping("/del")
    @ResponseBody
    public Object del(Integer idf){
        return id.del(idf);
    }

    //添加
    @RequestMapping("/add")
    @ResponseBody
    public Object add(Inform inform){
        return id.add(inform);
    }

    //修改
    @RequestMapping("/upd")
    @ResponseBody
    public Object upd(Inform inform,Integer idf){
        return id.upd(inform,idf);
    }

    //根据ID查询数据
    @RequestMapping("/find")
    @ResponseBody
    public Object find(Integer idf){
        return id.find(idf);
    }
}
