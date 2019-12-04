package com.quhaiming.entity;

public class Some {

	
	private String mohu;
	
	private String YM;

	public String getMohu() {
		return mohu;
	}

	public void setMohu(String mohu) {
		this.mohu = mohu;
	}

	public String getYM() {
		return YM;
	}

	public void setYM(String yM) {
		YM = yM;
	}

	@Override
	public String toString() {
		return "Some [mohu=" + mohu + ", YM=" + YM + "]";
	}

	public Some(String mohu, String yM) {
		super();
		this.mohu = mohu;
		YM = yM;
	}

	public Some() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
