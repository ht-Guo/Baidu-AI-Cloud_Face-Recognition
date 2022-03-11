package com.sykj.edu.controller;


import com.sykj.edu.dao.VipManage_Dao;
import com.sykj.edu.vo.VipManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping("lest")
@Controller

    public class VipManage_Controller {
        @Autowired
        private VipManage_Dao dao;
        @RequestMapping("findall")
        @ResponseBody
        public Object find(VipManage vipManage){
            return dao.queryallList(vipManage);
        }

        @RequestMapping("insert")
        @ResponseBody
        public Object insert(VipManage vipManage){
              return dao.toinsert(vipManage);
        }
    }

