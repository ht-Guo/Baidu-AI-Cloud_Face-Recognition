package com.sykj.edu.vo;

/*
  Created by IntelliJ IDEA.
  @User: guohaotian
  @Date: 2022/2/15 21:41
  @package_Name: com.sykj.edu.vo
  @Class_Name: SysUserVo
  To change this template use File | Settings | File Templates.
*/

//用户管理表
public class SysUserVo {
    private int uidf;//UIDF
    private String password;//登录密码
    private String username;//登录名
    private String truename;//真实姓名
    private String email;//邮件
    private String mobilePhone;//移动电话
    private String homePhone;//家庭电话
    private String officePhone;//办公电话
    private String addr;//住址
    private int isActive;//是否启用
    private int depid;//部门编号
    private int jobid;//职位编号
    private String state;//状态

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getUidf() {
        return uidf;
    }

    public void setUidf(int uidf) {
        this.uidf = uidf;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    public int getDepid() {
        return depid;
    }

    public void setDepid(int depid) {
        this.depid = depid;
    }

    public int getJobid() {
        return jobid;
    }

    public void setJobid(int jobid) {
        this.jobid = jobid;
    }
}
