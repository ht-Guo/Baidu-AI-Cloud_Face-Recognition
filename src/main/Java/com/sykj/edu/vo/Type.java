package com.sykj.edu.vo;

/**
 * @Date 2022/3/4 - 14:31
 */

//基础数据
public class Type {
    private Integer id;//ID
    private String baseValue; //数据值
    private Integer state;

    public String getBaseValue() {
        return baseValue;
    }

    public void setBaseValue(String baseValue) {
        this.baseValue = baseValue;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}
