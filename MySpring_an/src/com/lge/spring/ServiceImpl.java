package com.lge.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class ServiceImpl implements Iservice {
	@Autowired
	private IDAO dao;
//	public ServiceImpl(IDAO dao) {
//		// TODO Auto-generated constructor stub
//		this.dao = dao;
//	}
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("work");
		dao.save();
		dao.search();
	}
}
