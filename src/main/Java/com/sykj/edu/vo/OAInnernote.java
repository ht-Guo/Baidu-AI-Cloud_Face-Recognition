package com.sykj.edu.vo;

/**
 * Created by IntelliJ IDEA.
 *
 * @@Description:内部短消息vo类
 * @User:guohaotian
 * @Date: 2022/3/3 20:34
 * @package_Name: com.sykj.edu.vo
 * @Class_Name: OAInnernote
 * To change this template use File | Settings | File Templates.
 */

public class OAInnernote {
    /**
     *主键  msgid
     * 标题  title
     * 内容 content
     *  发送人ID sendId
     * 发送日期 sendtime
     * 收件人ID recId
     *  是否已读 isReaded
     * 是否删除 isDel
     *  读取日期 readtime
     * 消息类型 msgType
     * **/

    private int msgid;
    private String title;
    private String content;
    private int sendid;
    private String  sendtime;
    private int recid;
    private int isReaded;
    private int isDel;
    private String readtime;
    private int msgType;

    public OAInnernote(int msgid, String title, String content, int sendid, String sendtime, int recid, int isReaded, int isDel, String readtime, int msgType) {
        this.msgid = msgid;
        this.title = title;
        this.content = content;
        this.sendid = sendid;
        this.sendtime = sendtime;
        this.recid = recid;
        this.isReaded = isReaded;
        this.isDel = isDel;
        this.readtime = readtime;
        this.msgType = msgType;
    }

    public OAInnernote() {
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

    public int getSendid() {
        return sendid;
    }

    public void setSendid(int sendid) {
        this.sendid = sendid;
    }

    public String getSendtime() {
        return sendtime;
    }

    public void setSendtime(String sendtime) {
        this.sendtime = sendtime;
    }

    public int getRecid() {
        return recid;
    }

    public void setRecid(int recid) {
        this.recid = recid;
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
