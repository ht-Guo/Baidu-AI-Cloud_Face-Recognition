package com.sykj.edu.vo;

/*
  Created by IntelliJ IDEA.
  @User: guohaotian
  @Date: 2022/2/21 9:38
  @package_Name: com.sykj.edu.vo
  @Class_Name: Home
  To change this template use File | Settings | File Templates.
*/

//初始化接口
public class Home {
    private String title;
    private String href;

    public Home(String title, String href) {
        this.title = title;
        this.href = href;
    }

    public Home() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }
}
