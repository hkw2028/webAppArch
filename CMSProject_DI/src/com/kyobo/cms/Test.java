package com.kyobo.cms;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		BeanFactory  ctx=new ClassPathXmlApplicationContext("/config/app.xml");
		
		ICustomerService ser=ctx.getBean(ICustomerService.class);
//		ser.save(new Customer(110,"���ö��","����"));
//		ser.save(new Customer(112,"���","�λ�"));
//		ser.save(new Customer(113,"��ö","����"));
//		ser.save(new Customer(114,"��öö��","�뱸"));
//		ser.save(new Customer(115,"��ö����","��õ"));
		List<Customer> clist=ser.getCustomers();// dao.search();
		for(Customer c: clist) {
			System.out.println(c);
		}
	}
}
