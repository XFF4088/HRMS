package com.hqyj.ssmtesttwo.modal;

public class MyPage {
	

	@Override
	public String toString() {
		return "MyPage [page=" + page + ", rows=" + rows + ", start=" + start + "]";
	}
	//页码
	private Integer page;
	//每页显示的条数
	private Integer rows;
	//mysql分页查询起始的位置
	private Integer start;
	
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}



}
