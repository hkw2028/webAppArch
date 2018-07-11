package kr.jaen.spring.di;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDaoImpl implements ICustomerDao {

	@Autowired
	private SqlSession sqlsession;
	
	public void add(Customer c) {
		sqlsession.insert("cms.insert", c);
	}

	public Customer search(int num) {
		return sqlsession.selectOne("cms.selectByNum", num);
	}

	public List<Customer> search() {
		return sqlsession.selectList("cms.selectList");
	}

	public void update(int num, String address) {
		Map<String, Object> map = new HashMap<>();
		map.put("num", num);
		map.put("address",address);
		//map.put("salay", salary);   // ���� �߻� �ڵ�   Ʈ������ ����� �ѹ� ó�� ���� Ȯ��
		sqlsession.update("cms.update", map);
	}

	public void delete(int num) {
		sqlsession.delete("cms.delete", num);
	}
}
