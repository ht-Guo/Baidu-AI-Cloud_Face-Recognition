package com.sykj.edu.controller;


import com.sykj.edu.dao.InquiryStatisticsDao;
import com.sykj.edu.vo.InquiryStatistics;
import com.sykj.edu.vo.IntegratedQuery;
import com.sykj.edu.vo.ListOftheMasses;
import com.sykj.edu.vo.PublicList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("InquiryStatistics")
@Controller

public class InquiryStatistics_Controller {
    @Autowired
    private InquiryStatisticsDao isd;

    @ResponseBody
    @RequestMapping("inqs")
    public Object inqs(String registerTimef) {
        List<InquiryStatistics> all = isd.findAll(registerTimef);
        return all;
    }
    //我区群众到省、市、区集体上访一览表

    //我区群众到省、市集体上访明细表
    @RequestMapping("mxb")
    @ResponseBody
    public Object mxb(String registerTimef) {
        List<ListOftheMasses> alll = isd.findAlll(registerTimef);
        return alll;
    }

    //群众到我区集体上访明细表
    @RequestMapping("ylb")
    @ResponseBody
    public Object ylb(String registerTimef) {
        List<PublicList> findas = isd.findas(registerTimef);
        return findas;
    }

    //综合查询
    @RequestMapping("zhcx")
    @ResponseBody
    public Object zhcx(IntegratedQuery idq) {
        Object findss = isd.findss(idq);
        return findss;

    }
}
