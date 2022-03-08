package com.sykj.edu.vo;

public class ListOftheMasses {
    //我区群众到省、市集体上访明细表
    private int idf;//序号
    private String registerTimef;//登记时间
    private String letterNamef; //来访人
    private int visiterCount;//人数
    private String thirdQuestionType;//问题分类
    private String questionAffiliations;//属地部门
    private String letterAddressf;//信访人地址
    private String dataValue;//备注

    public int getIdf() {
        return idf;
    }

    public void setIdf(int idf) {
        this.idf = idf;
    }

    public String getRegisterTimef() {
        return registerTimef;
    }

    public void setRegisterTimef(String registerTimef) {
        this.registerTimef = registerTimef;
    }

    public String getLetterNamef() {
        return letterNamef;
    }

    public void setLetterNamef(String letterNamef) {
        this.letterNamef = letterNamef;
    }

    public int getVisiterCount() {
        return visiterCount;
    }

    public void setVisiterCount(int visiterCount) {
        this.visiterCount = visiterCount;
    }

    public String getThirdQuestionType() {
        return thirdQuestionType;
    }

    public void setThirdQuestionType(String thirdQuestionType) {
        this.thirdQuestionType = thirdQuestionType;
    }

    public String getQuestionAffiliations() {
        return questionAffiliations;
    }

    public void setQuestionAffiliations(String questionAffiliations) {
        this.questionAffiliations = questionAffiliations;
    }

    public String getLetterAddressf() {
        return letterAddressf;
    }

    public void setLetterAddressf(String letterAddressf) {
        this.letterAddressf = letterAddressf;
    }

    public String getDataValue() {
        return dataValue;
    }

    public void setDataValue(String dataValue) {
        this.dataValue = dataValue;
    }
}
