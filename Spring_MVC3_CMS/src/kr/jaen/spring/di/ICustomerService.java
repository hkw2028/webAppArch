package kr.jaen.spring.di;

import java.util.List;

public interface ICustomerService {
   List<Customer>  search();
   void save(Customer c);
   Customer search(int num);
}
