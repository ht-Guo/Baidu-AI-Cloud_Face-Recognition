package com.sykj.edu.vo;

/*
  Created by IntelliJ IDEA.
  @User: guohaotian
  @Date: 2022/2/21 9:38
  @package_Name: com.sykj.edu.vo
  @Class_Name: Login
  To change this template use File | Settings | File Templates.
*/

//初始化接口
public class Login {
    private String title;
    private String image;
    private String href;

    public Login(String title, String image, String href) {
        this.title = title;
        this.image = image;
        this.href = href;
    }

    public Login() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }
}
