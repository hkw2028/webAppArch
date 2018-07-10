package kr.jaen.spring.di1;

public class OracleDAO implements IDAO  {
	private int count;
	private int index;
	
	
	public OracleDAO(int count, int index) {
		this.count=count;
		this.index=index;
	}

	@Override
	public void insert(){
		System.out.println("DB����"+count);
	}

	@Override
	public void update(){
		System.out.println("DB����"+index);
	}
}
