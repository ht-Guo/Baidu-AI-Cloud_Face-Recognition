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
//    查出的总数据
    private int count;
//    内部短消息
        private int msgid;//主键
    private String title;  //标题
    private String content;  //内容
    private int sendId; //发送人ID
    private String sendtime; //发送日期
    private int    recId; //收件人ID
    private int isReaded; //是否已读
    private int isDel; //是否删除
    private String readtime;//读取日期
    private int msgType;//消息类型

    public ArchiveSupervisorVo(int idf, String dbr, String bdbr, String supervisorTitlef, String supervisorMsgf, String supervisorTimef, String supervisorstatusf, String supervisorReplyIDf, int count, int msgid, String title, String content, int sendId, String sendtime, int recId, int isReaded, int isDel, String readtime, int msgType) {
        this.idf = idf;
        this.dbr = dbr;
        this.bdbr = bdbr;
        SupervisorTitlef = supervisorTitlef;
        SupervisorMsgf = supervisorMsgf;
        SupervisorTimef = supervisorTimef;
        Supervisorstatusf = supervisorstatusf;
        SupervisorReplyIDf = supervisorReplyIDf;
        this.count = count;
        this.msgid = msgid;
        this.title = title;
        this.content = content;
        this.sendId = sendId;
        this.sendtime = sendtime;
        this.recId = recId;
        this.isReaded = isReaded;
        this.isDel = isDel;
        this.readtime = readtime;
        this.msgType = msgType;
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getMsgid() {
        return msgid;
    }

    public void setMsgid(int msgid) {
        this.msgid = msgid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getSendId() {
        return sendId;
    }

    public void setSendId(int sendId) {
        this.sendId = sendId;
    }

    public String getSendtime() {
        return sendtime;
    }

    public void setSendtime(String sendtime) {
        this.sendtime = sendtime;
    }

    public int getRecId() {
        return recId;
    }

    public void setRecId(int recId) {
        this.recId = recId;
    }

    public int getIsReaded() {
        return isReaded;
    }

    public void setIsReaded(int isReaded) {
        this.isReaded = isReaded;
    }

    public int getIsDel() {
        return isDel;
    }

    public void setIsDel(int isDel) {
        this.isDel = isDel;
    }

    public String getReadtime() {
        return readtime;
    }

    public void setReadtime(String readtime) {
        this.readtime = readtime;
    }

    public int getMsgType() {
        return msgType;
    }

    public void setMsgType(int msgType) {
        this.msgType = msgType;
    }
}
