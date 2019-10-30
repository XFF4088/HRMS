package com.hqyj.ssmtesttwo.modal;

public class Student extends MyPage{

	@Override
	public String toString() {
		
		return "Student [sId=" + sId + ", sName=" + sName + ", sSex=" + sSex + "]"+super.toString();
	}
	private Integer sId;
	public Integer getsId() {
		return sId;
	}
	public void setsId(Integer sId) {
		this.sId = sId;
	}
	private String sName;
	private String sSex;
	
	


	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsSex() {
		return sSex;
	}
	public void setsSex(String sSex) {
		this.sSex = sSex;
	}
}
