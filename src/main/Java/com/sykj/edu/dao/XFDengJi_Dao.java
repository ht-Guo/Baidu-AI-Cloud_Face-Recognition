package com.sykj.edu.dao;


import com.sykj.edu.vo.XFDJVo;

public interface XFDengJi_Dao {

    //下拉列表中的值
    public Object findBase(String baseValue) throws Exception;


    //新增信访人信息表
    public int addXFRXX(XFDJVo fe);

    /**
     * 查询单位部门
     */
    public Object FindAllDepartment();

    /**
     * 查询领导编号与名字
     * */
    public Object FindSys_user();

    /**
     * 增加重点对象表
     * */
    public int InsertVIPManage(XFDJVo xfxx);

    /**
     * 增加信访件信息
     * */
    public int InsertLetterbaseInfo(XFDJVo xfxx);

    /**
     * 增加信访审批流程
     *
     信访件编号 let_idf
     意见内容 suggestionContentf
     办理人编号  userId
     填写时间 fillTimef
     是否同意  isAgreef 0不同意 1同意
     建议属性类别 letterPropertiesf
     排列序号 sortid 0
     办理状态 state 待办理
     办理期限 endtime
     黄牌 yellowWarning 0
     红牌 redWarning 0
     * */
    public int InsertApproveInfo(XFDJVo xfj);

}
