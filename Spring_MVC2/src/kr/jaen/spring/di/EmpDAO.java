package kr.jaen.spring.di;

import java.sql.SQLException;
import java.util.ArrayList;

public interface EmpDAO {

	public abstract void save(Employee e) throws SQLException;

	public abstract ArrayList<Employee> search() throws SQLException;

	public abstract Employee search(int snum) throws SQLException;

}