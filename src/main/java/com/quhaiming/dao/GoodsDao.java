package com.quhaiming.dao;

import java.util.List;

import com.quhaiming.entity.Goods;
import com.quhaiming.entity.Some;
import com.quhaiming.entity.Tbrand;
import com.quhaiming.entity.Types;

public interface GoodsDao {

	
	//主查询
	List<Goods> listGoods(Some some);
	//分类子查询
	Types listTyByid(Integer id);
	//品牌子查询
	Tbrand listTbByid(Integer id);
	//品牌注入查询
	List<Tbrand> listTb();
	//分类注入查询
	List<Types> listTy();
	//添加方法
	int addGoods(Goods goods);
	//删除
	int deleAll(String ids);
	//修改回显
	Goods toupdate(String id);
	//修改
	int update(Goods goods);
	
	
	
	
	
}
