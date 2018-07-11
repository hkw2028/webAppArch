package kr.jaen.spring.di1;

import org.springframework.stereotype.Component;

@Component
public class OracleDAO implements IDAO  {
	private int count;
	private int index;
	
	public OracleDAO(){}
	public OracleDAO(int count, int index) {
		this.count=count;
		this.index=index;
	}

	@Override
	public void insert(){
		System.out.println("DB저장"+count);
	}

	@Override
	public void update(){
		System.out.println("DB수정"+index);
	}
}
