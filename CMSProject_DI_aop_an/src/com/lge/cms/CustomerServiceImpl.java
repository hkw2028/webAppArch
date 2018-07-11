package com.lge.cms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements ICustomerService {
	ICustomerDao  dao;
	
	@Autowired
	public CustomerServiceImpl(ICustomerDao dao) {
		this.dao=dao;
	}
	@Override
	public List<Customer> getCustomers() {
		return dao.search();
	}
	public void save(Customer c) {
		dao.add(c);
	}
}
