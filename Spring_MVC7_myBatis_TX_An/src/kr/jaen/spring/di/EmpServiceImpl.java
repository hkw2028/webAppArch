package kr.jaen.spring.di;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	@Qualifier("dao")
	private EmpDAO dao;

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void save(Employee e) {
		dao.save(e);
		dao.salaryUpdate(e.getSnum(), e.getSalary() * 12);
	}

	@Override
	public List<Employee> search() {
		return dao.search();
	}

	@Override
	public Employee search(int snum) {
		return dao.search(snum);
	}

	@Override
	public int salarySearch(int snum) {
		return dao.salarySearch(snum);
	}
}
