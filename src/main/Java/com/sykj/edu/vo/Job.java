package com.sykj.edu.vo;

/**
 * @Date 2022/3/3 - 8:55
 */

//职位表
public class Job {
    private Integer jobid;//编号
    private String jobname;//名称
    private String description;//描述

    public Integer getJobid() {
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
