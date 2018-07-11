package kr.jaen.spring.di;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Service
public class EmpServiceImpl implements EmpService  {
	
	@Autowired
	private EmpDAO dao;

	@Override
	public void save(Employee e){
		e.setSalary(e.getSalary()*12);
		try {
			dao.save(e);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	@Override
	public ArrayList<Employee> search(){
		try {
			return dao.search();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public Employee  search(int snum){
		try {
			return dao.search(snum);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
