package kr.jaen.spring.aop1;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test1 {

	public static void main(String[] args) throws Exception  {
		BeanFactory  ctx=new ClassPathXmlApplicationContext("/config/app1.xml");
		
		IEmpService  ser=ctx.getBean(IEmpService.class);

		Employee  e=ser.search(1111);
		System.out.println(e);
	}

}
