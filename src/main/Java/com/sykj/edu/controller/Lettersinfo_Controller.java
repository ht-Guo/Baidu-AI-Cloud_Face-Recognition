package com.sykj.edu.controller;


import com.sykj.edu.dao.daoImpl.Lettersinfo_Daolmpl;
import com.sykj.edu.vo.Lettersinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("list")
public class Lettersinfo_Controller {
       @Autowired
       private Lettersinfo_Daolmpl dao;
       @RequestMapping("findAll")//查询所有信息
       @ResponseBody
       public Object find(Lettersinfo vip){
           return dao.queryallList(vip);
       }

       @RequestMapping("todelete")//删除
       @ResponseBody
       public Object del(Integer idf){
           return dao.todelete(idf);
       }

       @RequestMapping("/toinsert")//添加
       @ResponseBody
       public Object insert(Lettersinfo v){
           return dao.toinsert(v);
       }

       @RequestMapping("/toupdate")//回显值
       @ResponseBody
       public Object update(Integer idf){
           return dao.toupdate(idf);
       }

       @RequestMapping("/update")//修改
       @ResponseBody
       public Object up(Lettersinfo vi){
            return dao.update(vi);
       }

}
