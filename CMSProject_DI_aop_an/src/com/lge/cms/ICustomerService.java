package com.lge.cms;

import java.util.List;

public interface ICustomerService {
   List<Customer>  getCustomers();
   void save(Customer c);
}
