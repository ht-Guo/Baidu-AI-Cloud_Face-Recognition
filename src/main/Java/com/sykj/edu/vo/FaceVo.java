package com.sykj.edu.vo;

/**
 * Created by IntelliJ IDEA.
 *
 * @@Description:人脸类
 * @User:guohaotian
 * @Date: 2022/3/5 10:21
 * @package_Name: com.sykj.edu.vo
 * @Class_Name: FaceVo
 * To change this template use File | Settings | File Templates.
 */

public class FaceVo {
    /**
     * bdy_userId 百度云编号
     * bdy_groupName 百度云组名称
     * username 用户名
     * truename 真实姓名
     * UIDF:用户编号
     * */
    private Integer bdy_userId;
    private String bdy_groupName;
    private int UIDF;
    private String username;
    private String truename;

    public FaceVo() {
    }

    public FaceVo(Integer bdy_userId, String bdy_groupName, int UIDF, String username, String truename) {
        this.bdy_userId = bdy_userId;
        this.bdy_groupName = bdy_groupName;
        this.UIDF = UIDF;
        this.username = username;
        this.truename = truename;
    }

    public Integer getBdy_userId() {
        return bdy_userId;
    }

    public void setBdy_userId(Integer byd_userId) {
        this.bdy_userId = byd_userId;
    }

    public String getBdy_groupName() {
        return bdy_groupName;
    }

    public void setBdy_groupName(String bdy_groupName) {
        this.bdy_groupName = bdy_groupName;
    }

    public int getUIDF() {
        return UIDF;
    }

    public void setUIDF(int UIDF) {
        this.UIDF = UIDF;
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
}
