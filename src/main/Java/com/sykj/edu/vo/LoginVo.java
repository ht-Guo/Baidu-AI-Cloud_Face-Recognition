package com.sykj.edu.vo;


//登录
public class LoginVo {
    private Integer uidf; //UIDF
    private String password;//登录密码
    private String username;//用户名
    private String truename;//真实姓名
    private String email;//邮箱
    private String mobilephone;//移动电话
    private String homephone;//家庭电话
    private String officephone;//办公电话
    private String addr;//住址
    private Integer isactive;//是否启用
    private Integer depid;//部门id
    private Integer jobid;//职位id
    private Integer user_id;
    private Integer role_id;//角色id
    private Integer function_id;//功能权限id
    private Integer id;
    private String description;//功能描述
    private String action;
    private String method;

    public LoginVo() {
    }

    public LoginVo(Integer uidf, String password, String username, String truename, String email, String mobilephone, String homephone, String officephone, String addr, Integer isactive, Integer depid, Integer jobid, Integer user_id, Integer role_id, Integer function_id, Integer id, String description, String action, String method) {

        this.uidf = uidf;
        this.password = password;
        this.username = username;
        this.truename = truename;
        this.email = email;
        this.mobilephone = mobilephone;
        this.homephone = homephone;
        this.officephone = officephone;
        this.addr = addr;
        this.isactive = isactive;
        this.depid = depid;
        this.jobid = jobid;
        this.user_id = user_id;
        this.role_id = role_id;
        this.function_id = function_id;
        this.id = id;
        this.description = description;
        this.action = action;
        this.method = method;
    }

    public Integer getUidf() {
        return uidf;
    }

    public void setUidf(Integer uidf) {
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

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
    }

    public String getHomephone() {
        return homephone;
    }

    public void setHomephone(String homephone) {
        this.homephone = homephone;
    }

    public String getOfficephone() {
        return officephone;
    }

    public void setOfficephone(String officephone) {
        this.officephone = officephone;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Integer getIsactive() {
        return isactive;
    }

    public void setIsactive(Integer isactive) {
        this.isactive = isactive;
    }

    public Integer getDepid() {
        return depid;
    }

    public void setDepid(Integer depid) {
        this.depid = depid;
    }

    public Integer getJobid() {
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public Integer getFunction_id() {
        return function_id;
    }

    public void setFunction_id(Integer function_id) {
        this.function_id = function_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
