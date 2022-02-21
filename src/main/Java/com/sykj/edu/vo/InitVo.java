package com.sykj.edu.vo;

/*
  Created by IntelliJ IDEA.
  @User: guohaotian
  @Date: 2022/2/19 23:01
  @package_Name: com.sykj.edu.vo
  @Class_Name: InitVo
  To change this template use File | Settings | File Templates.
*/

import java.util.List;

/**
 * 初始化
 * */
public class InitVo {
    private Home homeInfo;
    private Login logoInfo;
    private List menuInfo;

    public InitVo(Home homeInfo, Login logoInfo, List menuInfo) {
        this.homeInfo = homeInfo;
        this.logoInfo = logoInfo;
        this.menuInfo = menuInfo;
    }

    public  InitVo() {
    }

    public Home getHomeInfo() {
        return homeInfo;
    }

    public void setHomeInfo(Home homeInfo) {
        this.homeInfo = homeInfo;
    }

    public Login getLogoInfo() {
        return logoInfo;
    }

    public void setLogoInfo(Login logoInfo) {
        this.logoInfo = logoInfo;
    }

    public List getMenuInfo() {
        return menuInfo;
    }

    public void setMenuInfo(List menuInfo) {
        this.menuInfo = menuInfo;
    }
}
