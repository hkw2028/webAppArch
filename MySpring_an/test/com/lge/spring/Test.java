package com.lge.spring;

import static org.junit.jupiter.api.Assertions.*;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Test {

	@org.junit.jupiter.api.Test
	void anotherTest() {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("conf/app.xml");
		Iservice bean = beanFactory.getBean(Iservice.class);
		bean.work();
	}
	
	@org.junit.jupiter.api.Test
	void test() {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("conf/app.xml");
		Iservice bean = beanFactory.getBean(Iservice.class);
		bean.work();
	}
	
	
	@org.junit.jupiter.api.Test
	void daoTest() {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("conf/app.xml");
		IDAO bean = beanFactory.getBean(IDAO.class);
		bean.save();
		bean.search();
	}

}
