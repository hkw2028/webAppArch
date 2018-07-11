package kr.jaen.spring.di;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class EmpDAOImpl implements EmpDAO  {
	@Autowired
	JdbcTemplate temp;
	
	@Override
	public void save(Employee e) {
		String sql="insert into Employee values(?,?,?,?)";
		temp.update(sql,e.getSnum(),e.getSname(),e.getSalary(),e.getImg());
		
	}
	@Override
	public List<Employee> search() {
		List<Employee> list;
		String sql="Select * from Employee";
		list=temp.query(sql,new BeanPropertyRowMapper<>(Employee.class));
		return list;
	}
	@Override
	public Employee search(int snum) throws EmptyResultDataAccessException{
		Employee e=temp.queryForObject(
				"Select * from Employee where snum=?"
				, new BeanPropertyRowMapper<>(Employee.class)
				, snum);
		return e;
	}
}
