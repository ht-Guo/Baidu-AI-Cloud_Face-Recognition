package com.sykj.edu.dao;



import com.sykj.edu.vo.ArchiveSupervisorVo;

import java.util.List;


public interface DBGLDao {
//    private int idf; //编号
//    private String dbr;//督办人
//    private String bdbr;//被督办人
//    private String SupervisorTitlef;//督办标题
//    private String SupervisorMsgf;//督办信息
//    private String SupervisorTimef;//督办时间
//    private String Supervisorstatusf;//状态
//    private String SupervisorReplyIDf;//回复内容
    public List<Object> findAll(String SupervisorTitlef, String dbr, String bdbr, String beginTime, String finishTime, String Supervisorstatusf, int page,int limit,int userId);
//    通过idf查看内部信息表
    public ArchiveSupervisorVo findAll(String idf);
//    修改状态,增加内容
    public int updateStatus(int status,String idf,String SupervisorReplyIDf);
}
