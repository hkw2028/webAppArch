package com.lge.cms;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		BeanFactory  ctx=new ClassPathXmlApplicationContext("/config/app.xml");
		
		ICustomerService ser=ctx.getBean(ICustomerService.class);
		System.out.println(ser.getClass().getSimpleName());
		ser.save(new Customer(01326,"±è±èÃ¶¼ö","¼­¿ï"));
		ser.save(new Customer(21326,"±è¼ö","ºÎ»ê"));
		ser.save(new Customer(31326,"±èÃ¶","±¤ÁÖ"));
		ser.save(new Customer(41326,"±èÃ¶Ã¶¼ö","´ë±¸"));
		ser.save(new Customer(51326,"±èÃ¶¼ö¼ö","ÀÎÃµ"));
		List<Customer> clist=ser.getCustomers();// dao.search();
		for(Customer c: clist) {
			System.out.println(c);
		}
	}
}
