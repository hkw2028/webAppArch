package com.lge.spring;

public class ServiceImpl implements Iservice {
	private final IDAO dao;
	public ServiceImpl(IDAO dao) {
		// TODO Auto-generated constructor stub
		this.dao = dao;
	}
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("work");
		dao.save();
		dao.search();
	}
}
