package com.kyobo.cms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements ICustomerService {
	@Autowired
	ICustomerDao  dao;	
	@Override
	public List<Customer> getCustomers() {
		return dao.search();
	}
	public void save(Customer c) {
		dao.add(c);
	}
}
