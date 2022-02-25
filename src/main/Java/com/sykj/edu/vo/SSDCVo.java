package com.sykj.edu.vo;

/*
  Created by IntelliJ IDEA.
  @User: guohaotian
  @Date: 2022/2/23 15:41
  @package_Name: com.sykj.edu.vo
  @Class_Name: SSDCVo
  To change this template use File | Settings | File Templates.
*/

//实时督查数据
public class SSDCVo {
    private int idf;//流程审批编号
    private String yellowWarning;//黄牌
    private String redWarning;//红牌
    private String letterTitlef;//标题
    private String dname;//当前办理单位
    private String truename;//当前办理人真实姓名
    private int userid;//办理人编号
    private int count;//总页数
    private String state;//状态

    public SSDCVo(int idf, String yellowWarning, String redWarning, String letterTitlef, String dname, String truename, int userid, int count, String state) {
        this.idf = idf;
        this.yellowWarning = yellowWarning;
        this.redWarning = redWarning;
        this.letterTitlef = letterTitlef;
        this.dname = dname;
        this.truename = truename;
        this.userid = userid;
        this.count = count;
        this.state = state;
    }

    public SSDCVo() {
    }

    public int getIdf() {
        return idf;
    }

    public void setIdf(int idf) {
        this.idf = idf;
    }

    public String getYellowWarning() {
        return yellowWarning;
    }

    public void setYellowWarning(String yellowWarning) {
        this.yellowWarning = yellowWarning;
    }

    public String getRedWarning() {
        return redWarning;
    }

    public void setRedWarning(String redWarning) {
        this.redWarning = redWarning;
    }

    public String getLetterTitlef() {
        return letterTitlef;
    }

    public void setLetterTitlef(String letterTitlef) {
        this.letterTitlef = letterTitlef;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
