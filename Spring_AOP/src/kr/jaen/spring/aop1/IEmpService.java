package kr.jaen.spring.aop1;

public interface IEmpService {

	public abstract String getMsg();

	public abstract Employee search(int num) throws Exception;

}