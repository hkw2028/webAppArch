package kr.jaen.spring.di1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		BeanFactory  ctx=new ClassPathXmlApplicationContext("/config/applicationContext.xml");
		
		IDAO dao=ctx.getBean(IDAO.class);
		System.out.println((dao.getClass().getName()));
		dao.insert();
		dao.update();
		
		Car c=ctx.getBean(Car.class);
		c.start();
		c.stop();
		
		IService service =ctx.getBean(IService.class);
		service.work();
		service.play();
	}

}
