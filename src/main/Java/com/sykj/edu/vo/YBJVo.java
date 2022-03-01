package com.sykj.edu.vo;

/**
 * Created by IntelliJ IDEA.
 *
 * @User: guohaotian
 * @Date: 2022/2/28 17:16
 * @package_Name: com.sykj.edu.vo
 * @Class_Name: YBJVo
 * To change this template use File | Settings | File Templates.
 */
/**
 * 信访处理中的已办结vo类
 */

public class YBJVo {
    /**
     * 信访来源:	 letterSource
     * 标题: letterTitlef
     * 当前环节:state
     * 当前办理人:truename
     * 备注:letterPropertiesf
     * */
    private String letterSource;
    private String letterTitlef;
    private String state;
    private String truename;
    private String letterPropertiesf;
    private int count;

    /**
     * id信访来源id
     * dataValue信访来源名称
     * */
    private int id;
    private String dataValue;

    public YBJVo(String letterSource, String letterTitlef, String state, String truename, String letterPropertiesf, int count, int id, String dataValue) {
        this.letterSource = letterSource;
        this.letterTitlef = letterTitlef;
        this.state = state;
        this.truename = truename;
        this.letterPropertiesf = letterPropertiesf;
        this.count = count;
        this.id = id;
        this.dataValue = dataValue;
    }

    public String getLetterSource() {
        return letterSource;
    }

    public void setLetterSource(String letterSource) {
        this.letterSource = letterSource;
    }

    public String getLetterTitlef() {
        return letterTitlef;
    }

    public void setLetterTitlef(String letterTitlef) {
        this.letterTitlef = letterTitlef;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename;
    }

    public String getLetterPropertiesf() {
        return letterPropertiesf;
    }

    public void setLetterPropertiesf(String letterPropertiesf) {
        this.letterPropertiesf = letterPropertiesf;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataValue() {
        return dataValue;
    }

    public void setDataValue(String dataValue) {
        this.dataValue = dataValue;
    }

    public YBJVo() {
    }
}
