package com.hqyj.ssmtesttwo.modal;

public class MyPage {
	

	@Override
	public String toString() {
		return "MyPage [page=" + page + ", rows=" + rows + ", start=" + start + "]";
	}
	//ҳ��
	private Integer page;
	//ÿҳ��ʾ������
	private Integer rows;
	//mysql��ҳ��ѯ��ʼ��λ��
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
