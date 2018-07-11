package com.kyobo.cms;

import java.util.List;

public interface ICustomerService {
   List<Customer>  getCustomers();
   void save(Customer c);
}
