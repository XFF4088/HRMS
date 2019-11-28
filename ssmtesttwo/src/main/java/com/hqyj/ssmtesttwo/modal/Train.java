package com.hqyj.ssmtesttwo.modal;

public class Train extends MyPage{
	private Integer id;
	private String sname;
	private String name;
	private String content;
	private String pj;
	
	public Train() {
		super();
	}
	
	

	public Train(Integer id, String sname, String name, String content, String pj) {
		super();
		this.id = id;
		this.sname = sname;
		this.name = name;
		this.content = content;
		this.pj = pj;
	}



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}



	public String getSname() {
		return sname;
	}



	public void setSname(String sname) {
		this.sname = sname;
	}



	public String getPj() {
		return pj;
	}



	public void setPj(String pj) {
		this.pj = pj;
	}



	@Override
	public String toString() {
		return "Train [id=" + id + ", sname=" + sname + ", name=" + name + ", content=" + content + ", pj=" + pj + "]";
	}

	


	
}
