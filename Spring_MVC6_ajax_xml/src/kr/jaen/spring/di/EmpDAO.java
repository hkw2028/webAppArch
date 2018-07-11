package kr.jaen.spring.di;

import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;

public interface EmpDAO {

	public abstract void save(Employee e);

	public abstract List<Employee> search();

	public abstract Employee search(int snum)throws EmptyResultDataAccessException;

}