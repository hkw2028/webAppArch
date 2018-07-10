package kr.jaen.spring.di1;

public class ServiceImpl implements IService {
	private final String serviceName;
	
	private final IDAO dao;
	
	public ServiceImpl(String serviceName, IDAO dao) {
		this.serviceName = serviceName;
		this.dao = dao;
	}
	
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println(serviceName+" work");
		dao.insert();
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println(serviceName+" play");
		dao.update();
	}

}
