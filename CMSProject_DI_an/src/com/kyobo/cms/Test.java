package com.kyobo.cms;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		BeanFactory  ctx=new ClassPathXmlApplicationContext("/config/app.xml");
		
		ICustomerService ser=ctx.getBean(ICustomerService.class);
		ser.save(new Customer(1110,"���ö��","����"));
		ser.save(new Customer(1112,"���","�λ�"));
		ser.save(new Customer(1113,"��ö","����"));
		ser.save(new Customer(1114,"��öö��","�뱸"));
		ser.save(new Customer(1115,"��ö����","��õ"));
		List<Customer> clist=ser.getCustomers();// dao.search();
		for(Customer c: clist) {
			System.out.println(c);
		}
	}
}
