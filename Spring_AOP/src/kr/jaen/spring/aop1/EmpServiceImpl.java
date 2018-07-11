package kr.jaen.spring.aop1;


public class EmpServiceImpl implements IEmpService {


	@Override
	public String getMsg()  {		
		return "AOP Test";
	}

	@Override
	public Employee search(int num) throws Exception  {	
		System.out.println("AAAAAAAAAAAService...");
		int k=5;
		if(k==5){
			throw new Exception();
		}
		return new Employee(1111,"È«ÇÏ´Ã","¿µ¾÷",3000000);
	}

}
