package com.quhaiming.service;

import java.util.List;

import com.quhaiming.entity.Goods;
import com.quhaiming.entity.Some;
import com.quhaiming.entity.Tbrand;
import com.quhaiming.entity.Types;

public interface GoodsService {

	//主查询
	List<Goods> listGoods(Some some);

	List<Tbrand> listTb();

	List<Types> listTy();

	int addGoods(Goods goods);

	int deleAll(String ids);

	Goods toupdate(String id);

	int update(Goods goods);

}
