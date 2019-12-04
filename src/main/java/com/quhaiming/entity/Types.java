package com.quhaiming.entity;

public class Types {

	private Integer  cid;
	private String cname;
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Types [cid=" + cid + ", cname=" + cname + "]";
	}
	public Types(Integer cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	public Types() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
