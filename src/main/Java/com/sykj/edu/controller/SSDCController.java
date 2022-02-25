package com.sykj.edu.controller;

import com.sykj.edu.dao.SSDCDao;
import com.sykj.edu.vo.BasicDataTypeVo;
import com.sykj.edu.vo.SSDCVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/*
  Created by IntelliJ IDEA.
  @User: guohaotian
  @Date: 2022/2/22 9:47
  @package_Name: com.sykj.edu.controller
  @Class_Name: SSDCController
  To change this template use File | Settings | File Templates.
*/
@RequestMapping("SSDC")
@Controller
//实时督查控制层
public class SSDCController {
    @Autowired
    private SSDCDao sSDCDao;

//form表单上的查询条件
    @RequestMapping("FindAllBasicData")
    @ResponseBody
    public Object FindAllBasicData(){
//        List basicDataTypeVos = sSDCDao.FindAllBasicData();
        List list = sSDCDao.FindAllBasicData();
        return list;
    }

//    查询数据
    @RequestMapping("FindLetter")
    @ResponseBody
    public Object FindLetter(Integer letterRegisteridf, Integer letterSource, String letterTitlef, Integer Warning, Integer did, String truename, Integer page, Integer limit){
        List list = sSDCDao.FindLetter(letterRegisteridf, letterSource, letterTitlef, Warning, did, truename, page, limit);
        return list;
    }

//    信息发送
    @RequestMapping("XXFS")
    @ResponseBody
    public int xXFS(int supervisorf,int beensupervisorf,String supervisortitlef,String supervisormsgf){
        int insert = sSDCDao.insert(supervisorf, beensupervisorf, supervisortitlef, supervisormsgf);
        return insert;
    }

}
