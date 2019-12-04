package com.quhaiming.controller;

import java.util.List;

import org.json.simple.JSONArray;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.quhaiming.entity.Goods;
import com.quhaiming.entity.Some;
import com.quhaiming.entity.Tbrand;
import com.quhaiming.entity.Types;
import com.quhaiming.service.GoodsService;

@Controller
public class GoodsController {

	@Autowired
	GoodsService service;
	
	@RequestMapping("list")
	public String listGoods(Some some,Model m){
		
		if(some.getYM()==null||some.getYM().equals("")){
			
			some.setYM("1");
		}
		
		PageHelper.startPage(Integer.parseInt(some.getYM()), 3);
		List<Goods> list=service.listGoods(some);
		System.err.println("查询出的商品对象集合"+list);
		PageInfo pageInfo = new PageInfo(list);
		
		m.addAttribute("list",list);
		m.addAttribute("pageInfo",pageInfo);
		m.addAttribute("mohu",some.getMohu());
		
		return "list";
	}
	//添加品牌下拉框注入
	@ResponseBody
	@RequestMapping("listTb")
	public Object listTb(){
		
		List<Tbrand> tblist=service.listTb();
		return tblist;
	}
	//添加品牌下拉框注入
	@ResponseBody
	@RequestMapping("listTy")
	@Test
	public Object listTy(){
		
		List<Types> tylist=service.listTy();
		return tylist;
	}
	//添加
	@RequestMapping("addGoods")
	public String addGoods(Goods goods,Model m){
		
		System.err.println("添加获取的goods对象"+goods);
		int i=service.addGoods(goods);
		if(i>0){
			
			return "redirect:list";
			
		}
		return "addGoods";
	}
	//批量删除方法
	@ResponseBody
	@RequestMapping("deleAll")
	@Test
	public Object deleAll(String ids){
		
		System.err.println("ids"+ids);
		int i=service.deleAll(ids);	
		return i>0;
		
	}
	//修改回显方法
	@RequestMapping("toupdate")
	public String toupdate(String id,Model m){
		System.err.println("修改获取ID"+id);
		Goods good=service.toupdate(id);
		m.addAttribute("goods",good);
     	return "update";
	}
	
	//修改方法
	@Test
	@RequestMapping("update")
	public String update(Goods goods){
		
		int i=service.update(goods);
		if(i>0){
			return "redirect:list";
			
		}
		
		return "update";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
