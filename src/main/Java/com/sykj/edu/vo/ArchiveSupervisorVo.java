package com.sykj.edu.vo;

public class ArchiveSupervisorVo {
    private int idf; //编号
    private String dbr;//督办人
    private String bdbr;//被督办人
    private String SupervisorTitlef;//督办标题
    private String SupervisorMsgf;//督办信息
    private String SupervisorTimef;//督办时间
    private String Supervisorstatusf;//状态
    private String SupervisorReplyIDf;//回复内容
    private String status;

    public ArchiveSupervisorVo(int idf, String dbr, String bdbr, String supervisorTitlef, String supervisorMsgf, String supervisorTimef, String supervisorstatusf, String supervisorReplyIDf, String status, int count) {
        this.idf = idf;
        this.dbr = dbr;
        this.bdbr = bdbr;
        SupervisorTitlef = supervisorTitlef;
        SupervisorMsgf = supervisorMsgf;
        SupervisorTimef = supervisorTimef;
        Supervisorstatusf = supervisorstatusf;
        SupervisorReplyIDf = supervisorReplyIDf;
        this.status = status;
        this.count = count;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    //    查出的总数据
    private int count;



    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public ArchiveSupervisorVo() {
    }

    public int getIdf() {
        return idf;
    }

    public void setIdf(int idf) {
        this.idf = idf;
    }

    public String getDbr() {
        return dbr;
    }

    public void setDbr(String dbr) {
        this.dbr = dbr;
    }

    public String getBdbr() {
        return bdbr;
    }

    public void setBdbr(String bdbr) {
        this.bdbr = bdbr;
    }

    public String getSupervisorTitlef() {
        return SupervisorTitlef;
    }

    public void setSupervisorTitlef(String supervisorTitlef) {
        SupervisorTitlef = supervisorTitlef;
    }

    public String getSupervisorMsgf() {
        return SupervisorMsgf;
    }

    public void setSupervisorMsgf(String supervisorMsgf) {
        SupervisorMsgf = supervisorMsgf;
    }

    public String getSupervisorTimef() {
        return SupervisorTimef;
    }

    public void setSupervisorTimef(String supervisorTimef) {
        SupervisorTimef = supervisorTimef;
    }

    public String getSupervisorstatusf() {
        return Supervisorstatusf;
    }

    public void setSupervisorstatusf(String supervisorstatusf) {
        Supervisorstatusf = supervisorstatusf;
    }

    public String getSupervisorReplyIDf() {
        return SupervisorReplyIDf;
    }

    public void setSupervisorReplyIDf(String supervisorReplyIDf) {
        SupervisorReplyIDf = supervisorReplyIDf;
    }
}
