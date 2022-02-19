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
    private home homeInfo;
    private login logoInfo;
    private List menuInfo;

    public InitVo(home homeInfo, login logoInfo, List menuInfo) {
        this.homeInfo = homeInfo;
        this.logoInfo = logoInfo;
        this.menuInfo = menuInfo;
    }

    public  InitVo() {
    }

    public class home{
         private String title;
         private String href;

        public home(String title, String href) {
            this.title = title;
            this.href = href;
        }

        public home() {
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

    public class login{
        private String title;
        private String image;
        private String href;

        public login(String title, String image, String href) {
            this.title = title;
            this.image = image;
            this.href = href;
        }

        public login() {
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

    public class menu{
        private String title;
        private String icon;
        private String href;
        private String target;
        private List child;

        public menu(String title, String icon, String href, String target, List child) {
            this.title = title;
            this.icon = icon;
            this.href = href;
            this.target = target;
            this.child = child;
        }

        public menu() {
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

        public String getTarget() {
            return target;
        }

        public void setTarget(String target) {
            this.target = target;
        }

        public List getChild() {
            return child;
        }

        public void setChild(List child) {
            this.child = child;
        }
    }

    public class childs{
        private String title;
        private String href;
        private String icon;
        private String target;
        private List child;

        public childs(String title, String href, String icon, String target, List child) {
            this.title = title;
            this.href = href;
            this.icon = icon;
            this.target = target;
            this.child = child;
        }

        public childs() {
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

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getTarget() {
            return target;
        }

        public void setTarget(String target) {
            this.target = target;
        }

        public List getChild() {
            return child;
        }

        public void setChild(List childs) {
            this.child = childs;
        }
    }

    public home getHomeInfo() {
        return homeInfo;
    }

    public void setHomeInfo(home homeInfo) {
        this.homeInfo = homeInfo;
    }

    public login getLogoInfo() {
        return logoInfo;
    }

    public void setLogoInfo(login logoInfo) {
        this.logoInfo = logoInfo;
    }

    public List getMenuInfo() {
        return menuInfo;
    }

    public void setMenuInfo(List menuInfo) {
        this.menuInfo = menuInfo;
    }
}
