package com.quhaiming.entity;

import java.util.List;

public class Goods {

	//商品ID
	private Integer id;
	//商品名称
	private String name;
	//商品发布时间
	private String datea;
	//商品分类集合
	private Types types;
	//商品价格
	private double price;
	//商品状态
	private Integer status;
	//品牌分类集合
	private Tbrand tbrand;
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
	public String getDatea() {
		return datea;
	}
	public void setDatea(String datea) {
		this.datea = datea;
	}
	public Types getTypes() {
		return types;
	}
	public void setTypes(Types types) {
		this.types = types;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Tbrand getTbrand() {
		return tbrand;
	}
	public void setTbrand(Tbrand tbrand) {
		this.tbrand = tbrand;
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", datea=" + datea + ", types=" + types + ", price=" + price
				+ ", status=" + status + ", tbrand=" + tbrand + "]";
	}
	public Goods(Integer id, String name, String datea, Types types, double price, Integer status, Tbrand tbrand) {
		super();
		this.id = id;
		this.name = name;
		this.datea = datea;
		this.types = types;
		this.price = price;
		this.status = status;
		this.tbrand = tbrand;
	}
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
