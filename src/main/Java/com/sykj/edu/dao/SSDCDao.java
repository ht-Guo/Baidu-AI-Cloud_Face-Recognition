package com.sykj.edu.dao;

import com.sykj.edu.vo.BasicDataTypeVo;
import com.sykj.edu.vo.SSDCVo;

import java.util.List;

/*
  Created by IntelliJ IDEA.
  @User: guohaotian
  @Date: 2022/2/22 9:33
  @package_Name: com.sykj.edu.dao
  @Class_Name: SSDCDao
  To change this template use File | Settings | File Templates.
*/
//实时督查
public interface SSDCDao {
//    form表单上查询条件
    public List FindAllBasicData();
//    根据登录人编号去查询信息登录人为统计人，(来源分类,标题，预警，当前办理单位，当前办理人)
    public List FindLetter(Integer letterRegisteridf,Integer letterSource,String letterTitlef,Integer Warning,Integer did,String truename,Integer page,Integer limit);
//    发送督办信息(督办人，被督办人，标题,督办信息)
    public int insert(int supervisorf,int beensupervisorf,String supervisortitlef,String supervisormsgf);
}
