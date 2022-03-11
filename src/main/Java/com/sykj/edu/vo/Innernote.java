package com.sykj.edu.vo;

/**
 * @Date 2022/3/1 - 10:46
 */


//内部短消息
public class Innernote extends BaseVo{
    private Integer msgid;  //主键
    private String title;   //标题
    private String content; //内容
    private Integer sendid; //发送人ID
    private String sendtime;    //发送日期
    private Integer recid;  //收件人ID
    private Integer isreaded;   //是否已读
    private Integer isdel;  //是否删除
    private String readtime;    //读取日期
    private Integer msgtype;//类型
    private String letterNamef;//发送人
    private String dataValue;


    public String getLetterNamef() {
        return letterNamef;
    }

    public void setLetterNamef(String letterNamef) {
        this.letterNamef = letterNamef;
    }

    public Integer getMsgid() {
        return msgid;
    }

    public void setMsgid(Integer msgid) {
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

    public Integer getSendid() {
        return sendid;
    }

    public void setSendid(Integer sendid) {
        this.sendid = sendid;
    }

    public String getSendtime() {
        return sendtime;
    }

    public void setSendtime(String sendtime) {
        this.sendtime = sendtime;
    }

    public Integer getRecid() {
        return recid;
    }

    public void setRecid(Integer recid) {
        this.recid = recid;
    }

    public Integer getIsreaded() {
        return isreaded;
    }

    public void setIsreaded(Integer isreaded) {
        this.isreaded = isreaded;
    }

    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }

    public String getReadtime() {
        return readtime;
    }

    public void setReadtime(String readtime) {
        this.readtime = readtime;
    }

    public Integer getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(Integer msgtype) {
        this.msgtype = msgtype;
    }

    public String getDataValue() {
        return dataValue;
    }

    public void setDataValue(String dataValue) {
        this.dataValue = dataValue;
    }
}
