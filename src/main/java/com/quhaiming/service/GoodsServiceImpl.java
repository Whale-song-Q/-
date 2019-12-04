package com.quhaiming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.quhaiming.dao.GoodsDao;
import com.quhaiming.entity.Goods;
import com.quhaiming.entity.Some;
import com.quhaiming.entity.Tbrand;
import com.quhaiming.entity.Types;

@Transactional
@Service
public class GoodsServiceImpl implements GoodsService {

	
	@Autowired
	GoodsDao dao;

	@Override
	public List<Goods> listGoods(Some some) {
		// TODO Auto-generated method stub
		return dao.listGoods(some);
	}

	@Override
	public List<Tbrand> listTb() {
		// TODO Auto-generated method stub
		return dao.listTb();
	}

	@Override
	public List<Types> listTy() {
		// TODO Auto-generated method stub
		return dao.listTy();
	}

	@Override
	public int addGoods(Goods goods) {
		// TODO Auto-generated method stub
		return dao.addGoods(goods);
	}

	@Override
	public int deleAll(String ids) {
		// TODO Auto-generated method stub
		return dao.deleAll(ids);
	}

	@Override
	public Goods toupdate(String id) {
		// TODO Auto-generated method stub
		return dao.toupdate(id);
	}

	@Override
	public int update(Goods goods) {
		// TODO Auto-generated method stub
		return dao.update(goods);
	}


	
	
	
	
	
	
}
