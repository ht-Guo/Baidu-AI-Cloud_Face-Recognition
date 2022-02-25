package com.sykj.edu.vo;

/*
  Created by IntelliJ IDEA.
  @User: guohaotian
  @Date: 2022/2/22 9:33
  @package_Name: com.sykj.edu.vo
  @Class_Name: SSDCVo
  To change this template use File | Settings | File Templates.
*/


//实时督查form表单下拉框数据Vo
public class BasicDataTypeVo {
   private int lettersource;//信访来源编号
   private String dataValue;//信访来源名称
   private int did;//部门编号
   private String dname;//部门名称

    public BasicDataTypeVo(int lettersource, String dataValue, int did, String dname) {
        this.lettersource = lettersource;
        this.dataValue = dataValue;
        this.did = did;
        this.dname = dname;
    }

    public BasicDataTypeVo() {
    }

    public int getLettersource() {
        return lettersource;
    }

    public void setLettersource(int lettersource) {
        this.lettersource = lettersource;
    }

    public String getDataValue() {
        return dataValue;
    }

    public void setDataValue(String dataValue) {
        this.dataValue = dataValue;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
}
