package com.lge.cms;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		BeanFactory  ctx=new ClassPathXmlApplicationContext("/config/app.xml");
		
		ICustomerService ser=ctx.getBean(ICustomerService.class);
		System.out.println(ser.getClass().getSimpleName());
		ser.save(new Customer(01326,"���ö��","����"));
		ser.save(new Customer(21326,"���","�λ�"));
		ser.save(new Customer(31326,"��ö","����"));
		ser.save(new Customer(41326,"��öö��","�뱸"));
		ser.save(new Customer(51326,"��ö����","��õ"));
		List<Customer> clist=ser.getCustomers();// dao.search();
		for(Customer c: clist) {
			System.out.println(c);
		}
	}
}
