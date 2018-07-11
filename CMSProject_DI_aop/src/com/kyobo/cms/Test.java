package com.kyobo.cms;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		BeanFactory  ctx=new ClassPathXmlApplicationContext("/config/app.xml");
		
		ICustomerService ser=ctx.getBean(ICustomerService.class);
		System.out.println(ser.getClass().getSimpleName());
		ser.save(new Customer(1214213110,"���ö��","����"));
		ser.save(new Customer(1214213112,"���","�λ�"));
		ser.save(new Customer(1214213113,"��ö","����"));
		ser.save(new Customer(1214213114,"��öö��","�뱸"));
		ser.save(new Customer(1214213115,"��ö����","��õ"));
		List<Customer> clist=ser.getCustomers();// dao.search();
		for(Customer c: clist) {
			System.out.println(c);
		}
	}
}
