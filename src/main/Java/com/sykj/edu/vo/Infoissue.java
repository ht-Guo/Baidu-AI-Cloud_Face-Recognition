package com.sykj.edu.vo;

/**
 * Created by IntelliJ IDEA.
 *
 * @@Description:通知通告实体类
 * @User:guohaotian
 * @Date: 2022/3/4 8:28
 * @package_Name: com.sykj.edu.vo
 * @Class_Name: Infoissue
 * To change this template use File | Settings | File Templates.
 */

public class Infoissue {

    /**
     * 主键  idf
     * 类型 typeIdf
     *  标题  titlef
     *  发布人id userIdf
     * 内容  contentf
     *  是否有用  isUserf
     * 发布时间 pubTime
     * **/
    private int idf;
    private int typeIdf;
    private String titlef;
    private int userIdf;
    private String contentf;
    private int isUserf;
    private String pubTime;

    public Infoissue(int idf, int typeIdf, String titlef, int userIdf, String contentf, int isUserf, String pubTime) {
        this.idf = idf;
        this.typeIdf = typeIdf;
        this.titlef = titlef;
        this.userIdf = userIdf;
        this.contentf = contentf;
        this.isUserf = isUserf;
        this.pubTime = pubTime;
    }

    public Infoissue() {
    }

    public int getIdf() {
        return idf;
    }

    public void setIdf(int idf) {
        this.idf = idf;
    }

    public int getTypeIdf() {
        return typeIdf;
    }

    public void setTypeIdf(int typeIdf) {
        this.typeIdf = typeIdf;
    }

    public String getTitlef() {
        return titlef;
    }

    public void setTitlef(String titlef) {
        this.titlef = titlef;
    }

    public int getUserIdf() {
        return userIdf;
    }

    public void setUserIdf(int userIdf) {
        this.userIdf = userIdf;
    }

    public String getContentf() {
        return contentf;
    }

    public void setContentf(String contentf) {
        this.contentf = contentf;
    }

    public int getIsUserf() {
        return isUserf;
    }

    public void setIsUserf(int isUserf) {
        this.isUserf = isUserf;
    }

    public String getPubTime() {
        return pubTime;
    }

    public void setPubTime(String pubTime) {
        this.pubTime = pubTime;
    }
}
