package com.sykj.edu.controller;

import com.sykj.edu.dao.DBGLDao;
import com.sykj.edu.vo.ArchiveSupervisorVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("DcdbController")
@Controller
public class DCDBController {
    @Autowired
    private DBGLDao dBDao;

//督办信息表
    @RequestMapping("findall")
    @ResponseBody
    public Object list(String SupervisorTitlef,String dbr,String bdbr,String beginTime,String finishTime,String Supervisorstatusf,int page,int limit,Integer userId){
        List<Object> findall = dBDao.findAll(SupervisorTitlef,dbr,bdbr,beginTime,finishTime,Supervisorstatusf,page,limit,userId);
        return findall;
    }

    //内部信息表
    @RequestMapping("NBXX")
    @ResponseBody
    public Object list(String idf){
        ArchiveSupervisorVo findall = dBDao.findAll(idf);
        return findall;
    }

//    改变状态，回复内容
@RequestMapping("Update")
@ResponseBody
public Object Update(int status,String idf,String SupervisorReplyIDf){
    int i = dBDao.updateStatus(status, idf, SupervisorReplyIDf);
    return i;
}
}
