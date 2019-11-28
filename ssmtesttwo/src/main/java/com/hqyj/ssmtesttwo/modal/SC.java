package com.hqyj.ssmtesttwo.modal;

public class SC {
	private int sc_id;
	private int s_id;
	private int id;
	private String score;
	private String pj;
	public SC() {
		super();
	}
	public SC(int sc_id, int s_id, int id, String score, String pj) {
		super();
		this.sc_id = sc_id;
		this.s_id = s_id;
		this.id = id;
		this.score = score;
		this.pj = pj;
	}
	public int getSc_id() {
		return sc_id;
	}
	public void setSc_id(int sc_id) {
		this.sc_id = sc_id;
	}
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getPj() {
		return pj;
	}
	public void setPj(String pj) {
		this.pj = pj;
	}
	
}
