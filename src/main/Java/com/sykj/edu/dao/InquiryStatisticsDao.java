package com.sykj.edu.dao;


import com.sykj.edu.vo.InquiryStatistics;
import com.sykj.edu.vo.IntegratedQuery;
import com.sykj.edu.vo.ListOftheMasses;
import com.sykj.edu.vo.PublicList;

import java.util.List;

public interface InquiryStatisticsDao {
    //显示我区群众到省、市、区集体上访一览表
    public List<InquiryStatistics> findAll(String registerTimef);


    //我区群众到省、市集体上访明细表
    public List<ListOftheMasses> findAlll(String registerTimef);


    //群众到我区集体上访明细表
    public List<PublicList> findas(String registerTimef);

    //综合查询 1.总编号 2.信访人 3.登记时间 4.标题 5.登记人 6.状态
    public Object findss(IntegratedQuery idq);



}
