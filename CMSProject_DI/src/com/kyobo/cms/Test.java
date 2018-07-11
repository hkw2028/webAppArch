package com.kyobo.cms;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		BeanFactory  ctx=new ClassPathXmlApplicationContext("/config/app.xml");
		
		ICustomerService ser=ctx.getBean(ICustomerService.class);
//		ser.save(new Customer(110,"±è±èÃ¶¼ö","¼­¿ï"));
//		ser.save(new Customer(112,"±è¼ö","ºÎ»ê"));
//		ser.save(new Customer(113,"±èÃ¶","±¤ÁÖ"));
//		ser.save(new Customer(114,"±èÃ¶Ã¶¼ö","´ë±¸"));
//		ser.save(new Customer(115,"±èÃ¶¼ö¼ö","ÀÎÃµ"));
		List<Customer> clist=ser.getCustomers();// dao.search();
		for(Customer c: clist) {
			System.out.println(c);
		}
	}
}
