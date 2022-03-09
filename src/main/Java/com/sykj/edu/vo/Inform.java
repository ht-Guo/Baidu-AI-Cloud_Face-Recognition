package com.sykj.edu.vo;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @Date 2022/2/28 - 20:10
 */


//公共通告

public class Inform extends BaseVo{

    private Integer idf;    //编号
    private String titlef;//标题
    private Integer useridf;//发布人id
    private Integer type;//分类
    private String pubtime;//提交日期
    private String rolename;//发布人
    private String contentf;//内容
    private Integer isuserf;//是否有用

    public Integer getIsuserf() {
        return isuserf;
    }

    public void setIsuserf(Integer isuserf) {
        this.isuserf = isuserf;
    }

    public void setUseridf(Integer useridf) {
        this.useridf = useridf;
    }

    public String getContentf() {
        return contentf;
    }

    public void setContentf(String contentf) {
        this.contentf = contentf;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public Integer getIdf() {
        return idf;
    }

    public void setIdf(Integer idf) {
        this.idf = idf;
    }

    public String getTitlef() {
        return titlef;
    }

    public void setTitlef(String titlef) {
        this.titlef = titlef;
    }

    public Integer getUseridf() {
        return useridf;
    }

    public void setUserIdf(Integer useridf) {
        this.useridf = useridf;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPubtime() {
        return pubtime;
    }

    public void setPubtime(String pubtime) {
        this.pubtime = pubtime;
    }
}
