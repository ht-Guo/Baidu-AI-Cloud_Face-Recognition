package com.sykj.edu.dao;


import com.sykj.edu.vo.XFChaXun;
import com.sykj.edu.vo.XFDJVo;


public interface XFChaXunDao {
    public Object findAll(XFChaXun xFCX);
    /**
     * 修改信访的办理时限，回复时间，与状态
     * */
    public int UpdateLetterBaseInfo(XFDJVo vo);

    /**
     * 增加信访审批流程
     * */
    public int InsertApproveInfo(XFDJVo vo);

}
