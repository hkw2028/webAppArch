package kr.jaen.spring.di;

import java.util.ArrayList;

public interface EmpService {

	public abstract void save(Employee e);

	public abstract ArrayList<Employee> search();

	public abstract Employee search(int snum);

}