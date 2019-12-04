package com.quhaiming.entity;

public class Tbrand {

	private Integer tbid;
	
	private String tname;

	public Integer getTbid() {
		return tbid;
	}

	public void setTbid(Integer tbid) {
		this.tbid = tbid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	@Override
	public String toString() {
		return "Tbrand [tbid=" + tbid + ", tname=" + tname + "]";
	}

	public Tbrand(Integer tbid, String tname) {
		super();
		this.tbid = tbid;
		this.tname = tname;
	}

	public Tbrand() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
