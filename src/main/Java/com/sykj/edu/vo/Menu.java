package com.sykj.edu.vo;

import java.util.List;

/*
  Created by IntelliJ IDEA.
  @User: guohaotian
  @Date: 2022/2/21 9:39
  @package_Name: com.sykj.edu.vo
  @Class_Name: Menu
  To change this template use File | Settings | File Templates.
*/
public class Menu {
    private String title;
    private String icon;
    private String href;
    private String target;
    private List child;

    public Menu(String title, String icon, String href, String target, List child) {
        this.title = title;
        this.icon = icon;
        this.href = href;
        this.target = target;
        this.child = child;
    }

    public Menu() {
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
