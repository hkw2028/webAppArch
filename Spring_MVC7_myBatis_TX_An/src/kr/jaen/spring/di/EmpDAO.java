package kr.jaen.spring.di;

import java.util.List;

public interface EmpDAO {

	public abstract void save(Employee e);

	public abstract List<Employee> search();

	public abstract Employee search(int snum);

	public void salaryUpdate(int snum, int salary);

	public void delete(int snum);
	public int salarySearch(int snum);
}