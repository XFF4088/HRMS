package com.hqyj.ssmtesttwo.modal;

public class TrainPJ extends MyPage{
	private Student student;
	private Train train;
	private SC sc;
	public TrainPJ(Student student, Train train, SC sc) {
		super();
		this.student = student;
		this.train = train;
		this.sc = sc;
	}
	public TrainPJ() {
		super();
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Train getTrain() {
		return train;
	}
	public void setTrain(Train train) {
		this.train = train;
	}
	public SC getSc() {
		return sc;
	}
	public void setSc(SC sc) {
		this.sc = sc;
	}
	
	
}
