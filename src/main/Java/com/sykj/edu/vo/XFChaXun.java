package com.sykj.edu.vo;

public class XFChaXun extends BaseVo {
    private String letterRegisterIdf;//登记人编号
    private Integer idf;//查询号
    private String letterNamef;//信访人
    private String letterMobilef;//信访人电话
    private String dataValue;//来源
    private String letterTitlef;//标题
    private String registerTimef;//日期

    public XFChaXun(String letterRegisterIdf, Integer idf, String letterNamef, String letterMobilef, String dataValue, String letterTitlef, String registerTimef) {
        this.letterRegisterIdf = letterRegisterIdf;
        this.idf = idf;
        this.letterNamef = letterNamef;
        this.letterMobilef = letterMobilef;
        this.dataValue = dataValue;
        this.letterTitlef = letterTitlef;
        this.registerTimef = registerTimef;
    }

    public XFChaXun(Integer idf, String letterNamef, String letterMobilef, String dataValue, String letterTitlef, String registerTimef) {
        this.idf = idf;
        this.letterNamef = letterNamef;
        this.letterMobilef = letterMobilef;
        this.dataValue = dataValue;
        this.letterTitlef = letterTitlef;
        this.registerTimef = registerTimef;
    }

    public XFChaXun() {
    }

    public Integer getIdf() {
        return idf;
    }

    public void setIdf(Integer idf) {
        this.idf = idf;
    }

    public String getLetterNamef() {
        return letterNamef;
    }

    public void setLetterNamef(String letterNamef) {
        this.letterNamef = letterNamef;
    }

    public String getLetterMobilef() {
        return letterMobilef;
    }

    public void setLetterMobilef(String letterMobilef) {
        this.letterMobilef = letterMobilef;
    }

    public String getDataValue() {
        return dataValue;
    }

    public void setDataValue(String dataValue) {
        this.dataValue = dataValue;
    }

    public String getLetterTitlef() {
        return letterTitlef;
    }

    public void setLetterTitlef(String letterTitlef) {
        this.letterTitlef = letterTitlef;
    }

    public String getRegisterTimef() {
        return registerTimef;
    }

    public void setRegisterTimef(String registerTimef) {
        this.registerTimef = registerTimef;
    }

    public String getLetterRegisterIdf() {
        return letterRegisterIdf;
    }

    public void setLetterRegisterIdf(String letterRegisterIdf) {
        this.letterRegisterIdf = letterRegisterIdf;
    }
}
