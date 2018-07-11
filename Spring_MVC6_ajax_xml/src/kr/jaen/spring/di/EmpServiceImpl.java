package kr.jaen.spring.di;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
@Service
public class EmpServiceImpl implements EmpService  {
	
	@Autowired
	@Qualifier("dao")
	private EmpDAO dao;

	@Override
	public void save(Employee e){
		dao.save(e);
	}
	
	@Override
	public List<Employee> search(){
		return dao.search();
	}
	
	@Override
	public Employee  search(int snum)throws EmptyResultDataAccessException{
		return dao.search(snum);
	}
}
