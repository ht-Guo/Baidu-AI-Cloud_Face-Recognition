package com.sykj.edu.vo;

public class IntegratedQuery extends BaseVo{
    //综合查询
    private Integer idf;
    private Integer letterIDF;
    private String letterNamef;
    private String registerTimef;
    private String letterTitlef;
    private String questionAffiliations;
    private String truename;
    private Integer state;




    public Integer getIdf() {
        return idf;
    }

    public void setIdf(Integer idf) {
        this.idf = idf;
    }

    public Integer getLetterIDF() {
        return letterIDF;
    }

    public void setLetterIDF(Integer letterIDF) {
        this.letterIDF = letterIDF;
    }

    public String getLetterNamef() {
        return letterNamef;
    }

    public void setLetterNamef(String letterNamef) {
        this.letterNamef = letterNamef;
    }

    public String getRegisterTimef() {
        return registerTimef;
    }

    public void setRegisterTimef(String registerTimef) {
        this.registerTimef = registerTimef;
    }

    public String getLetterTitlef() {
        return letterTitlef;
    }

    public void setLetterTitlef(String letterTitlef) {
        this.letterTitlef = letterTitlef;
    }

    public String getQuestionAffiliations() {
        return questionAffiliations;
    }

    public void setQuestionAffiliations(String questionAffiliations) {
        this.questionAffiliations = questionAffiliations;
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
