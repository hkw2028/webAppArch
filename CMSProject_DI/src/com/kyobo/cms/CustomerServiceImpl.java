package com.kyobo.cms;

import java.util.List;

public class CustomerServiceImpl implements ICustomerService {
	ICustomerDao  dao;
	
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
