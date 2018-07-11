package kr.jaen.spring.di;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class EmpDAOImpl implements EmpDAO {
	@Autowired
	SqlSession sess;

	@Override
	public void save(Employee e) {
		System.out.println(e);
		sess.insert("emp.insert", e);
	}

	@Override
	public List<Employee> search() {
		return sess.selectList("emp.selectList");
	}

	@Override
	public Employee search(int snum) {
		return sess.selectOne("emp.selectByNum", snum);
	}

	public void salaryUpdate(int snum, int salary) {
		Map<String, Object> map = new HashMap<>();
		map.put("snum", snum);
		map.put("salary",salary);
		//map.put("salay", salary);   // 오류 발생 코드   트랜젝션 결과로 롤백 처리 여부 확인
		sess.update("emp.update", map);
	}

	public void delete(int snum) {
		sess.delete("emp.delete", snum);
	}

	@Override
	public int salarySearch(int snum) {
		return sess.selectOne("emp.salarySearch", snum);
	}
}
