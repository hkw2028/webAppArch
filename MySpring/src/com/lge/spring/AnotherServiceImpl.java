package com.lge.spring;

public class AnotherServiceImpl implements Iservice {
	private IDAO dao;
	public void setDao(IDAO dao) {
		this.dao = dao;
	}
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("another work");
		dao.save();
		dao.search();
	}
}
