package com.sykj.edu.controller;

import com.sykj.edu.dao.DBGLDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("DcdbController")
@Controller
public class DCDBController {
    @Autowired
    private DBGLDao dBDao;


    @RequestMapping("findall")
    @ResponseBody
    public Object list(String SupervisorTitlef,String dbr,String bdbr,String beginTime,String finishTime,String Supervisorstatusf,int page,int limit){
        List<Object> findall = dBDao.findAll(SupervisorTitlef,dbr,bdbr,beginTime,finishTime,Supervisorstatusf,page,limit);
        return findall;
    }


}
