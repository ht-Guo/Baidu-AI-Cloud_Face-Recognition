package com.sykj.edu.vo;

/**
 * @Date 2022/3/3 - 8:57
 */

//部门表
public class Dept {
    private Integer did;//编号
    private String dname;//名称
    private Integer pid;//上级部门
    private String info;//备用字段

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
