package kr.jaen.spring.di;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CustomerServiceImpl implements ICustomerService {
	@Autowired
	ICustomerDao  dao;
	

	@Override
	public List<Customer> search() {
		return dao.search();
	}
	public void save(Customer c) {
		dao.add(c);
	}
	@Override
	public Customer search(int num) {
		return dao.search(num);
	}
}
