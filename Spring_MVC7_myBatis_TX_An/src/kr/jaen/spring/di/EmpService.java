package kr.jaen.spring.di;

import java.util.List;

public interface EmpService {

	public abstract void save(Employee e);

	public abstract List<Employee> search();

	public abstract Employee search(int snum);

	public int salarySearch(int snum);
}