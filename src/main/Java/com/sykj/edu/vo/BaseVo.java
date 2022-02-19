package com.sykj.edu.vo;

import java.util.List;

//公共的vo 用于列表查询，显示数据时使用
public class BaseVo {
      private Integer code;
      private String msg;
      private Integer count;
      private List data;

    public BaseVo() {
    }

    public BaseVo(Integer code, String msg, Integer count, List data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }
}
