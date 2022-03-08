package com.sykj.edu.vo;

public class BaseVo {
	private Integer page=1;//第几页
    private Integer limit=10;//每页几条
    private Integer startpage;//分页查询，从第几条数据开始查询
    
    
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
	public Integer getStartpage() {
		return (page-1)*limit;
	}
	public void setStartpage(Integer startpage) {
		this.startpage = startpage;
	}
    
    
}
