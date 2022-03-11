package com.sykj.edu.vo;

//对象信息
public class Lettersinfo extends BaseVo {
    private Integer idf;//编号
    private String letterNamef;//信访人姓名
    private Integer cardTypef;//证件类型编号
    private String letterCardNof;//信访人证件号
    private String letterMobilef;//联系电话
    private String workDept;//工作单位
    private String letterPostNof;//单位邮编
    private String letterAddressf;//联系地址
    private String letterHomeAddrf;//常住地址
    private String letterAdsPostNof;//联系地址邮编
    private String letterOriRegAdsf;//户籍地址
    private Integer isVIPf;//重点维稳对象
    private String remark;//备注
    private String recordDatef;//最新时间

    public String getRecordDatef() {
        return recordDatef;
    }

    public void setRecordDatef(String recordDatef) {
        this.recordDatef = recordDatef;
    }

    public Integer getIsVIPf() {
        return isVIPf;
    }

    public void setIsVIPf(Integer isVIPf) {
        this.isVIPf = isVIPf;
    }

    public String getLetterHomeAddrf() {
        return letterHomeAddrf;
    }

    public void setLetterHomeAddrf(String letterHomeAddrf) {
        this.letterHomeAddrf = letterHomeAddrf;
    }

    public void setIdf(Integer idf) {
        this.idf = idf;
    }

    public Integer getIdf() {
        return idf;
    }

    public Integer getCardTypef() {
        return cardTypef;
    }

    public void setCardTypef(Integer cardTypef) {
        this.cardTypef = cardTypef;
    }

    public String getLetterPostNof() {
        return letterPostNof;
    }

    public void setLetterPostNof(String letterPostNof) {
        this.letterPostNof = letterPostNof;
    }

    public String getLetterAddressf() {
        return letterAddressf;
    }

    public void setLetterAddressf(String letterAddressf) {
        this.letterAddressf = letterAddressf;
    }

    public String getLetterAdsPostNof() {
        return letterAdsPostNof;
    }

    public void setLetterAdsPostNof(String letterAdsPostNof) {
        this.letterAdsPostNof = letterAdsPostNof;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getLetterNamef() {
        return letterNamef;
    }

    public void setLetterNamef(String letterNamef) {
        this.letterNamef = letterNamef;
    }

    public String getLetterCardNof() {
        return letterCardNof;
    }

    public void setLetterCardNof(String letterCardNof) {
        this.letterCardNof = letterCardNof;
    }

    public String getLetterMobilef() {
        return letterMobilef;
    }

    public void setLetterMobilef(String letterMobilef) {
        this.letterMobilef = letterMobilef;
    }

    public String getWorkDept() {
        return workDept;
    }

    public void setWorkDept(String workDept) {
        this.workDept = workDept;
    }

    public String getLetterOriRegAdsf() {
        return letterOriRegAdsf;
    }

    public void setLetterOriRegAdsf(String letterOriRegAdsf) {
        this.letterOriRegAdsf = letterOriRegAdsf;
    }

    }