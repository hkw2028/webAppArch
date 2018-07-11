package com.kyobo.cms;


import java.util.List;

public interface ICustomerDao {
	void add(Customer c);

	Customer search(int num);

	List<Customer> search();

	void update(int num, String address);

	void delete(int num);
}
