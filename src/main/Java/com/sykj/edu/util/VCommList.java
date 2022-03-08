package com.sykj.edu.util;

import java.util.List;

public class VCommList {
	
	private Integer code;//服务器返回的状态码 0-返回成功
    private String msg;//服务器返回的错误消息
    private Integer count;//列表共有多少条数据，分页时使用
    private List data;//列表要显示的数据
    private Integer page;//第几页
    private Integer limit;//每页几条
    private Integer startpage;//分页查询，从第几条数据开始查询

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
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public void setStartpage(Integer startpage) {
		this.startpage = startpage;
	}
}
