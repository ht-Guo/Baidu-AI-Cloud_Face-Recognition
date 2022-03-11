package com.sykj.edu.vo;



public class VipManage extends BaseVo {
    private Integer idf;//编号
    private Integer vipidf;
    private String recordDatef;//最新时间
    private Integer useridf;//登记人编号
    private String titlef;//维稳标题
    private String contentf;//维稳内容

    public String getTitlef() {
        return titlef;
    }

    public void setTitlef(String titlef) {
        this.titlef = titlef;
    }

    private String recordTypef;//维稳类型

    public String getRecordTypef() {
        return recordTypef;
    }

    public void setRecordTypef(String recordTypef) {
        this.recordTypef = recordTypef;
    }

    public String getRecordDatef() {
        return recordDatef;
    }

    public void setRecordDatef(String recordDatef) {
        this.recordDatef = recordDatef;
    }

    public Integer getUseridf() {
        return useridf;
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
    public Integer getIdf() {
        return idf;
    }

    public void setIdf(Integer idf) {
        this.idf = idf;
    }
    
    public Integer getVipidf() {
        return vipidf;
    }

    public void setVipidf(Integer vipidf) {
        this.vipidf = vipidf;
    }
}
