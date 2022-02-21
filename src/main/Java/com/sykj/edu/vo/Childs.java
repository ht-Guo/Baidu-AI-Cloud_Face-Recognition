package com.sykj.edu.vo;

import java.util.List;

/*
  Created by IntelliJ IDEA.
  @User: guohaotian
  @Date: 2022/2/21 9:40
  @package_Name: com.sykj.edu.vo
  @Class_Name: Childs
  To change this template use File | Settings | File Templates.
*/
public class Childs {
    private String title;
    private String href;
    private String icon;
    private String target;
    private List child;

    public Childs(String title, String href, String icon, String target, List child) {
        this.title = title;
        this.href = href;
        this.icon = icon;
        this.target = target;
        this.child = child;
    }

    public Childs() {
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
