package com.lge.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnotherServiceImpl implements Iservice {
	@Autowired
	private IDAO dao;	
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("another work");
		dao.save();
		dao.search();
	}
}
