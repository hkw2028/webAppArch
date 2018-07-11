package kr.jaen.spring.aop1;

public class Employee {

	private int emp_no;
	private String emp_name;
	private String dept_name;
	private int salary;
	
	public Employee() {
		super();
	}

	public Employee(int emp_no, String emp_name, String dept_name, int salary) {
		super();
		this.emp_no = emp_no;
		this.emp_name = emp_name;
		this.dept_name = dept_name;
		this.salary=salary;
	}
	public Employee(int emp_no, String emp_name, String dept_name) {
		super();
		this.emp_no = emp_no;
		this.emp_name = emp_name;
		this.dept_name = dept_name;
		salary=1000000;
	}

	public int getEmp_no() {
		return emp_no;
	}

	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [getEmp_no()=");
		builder.append(getEmp_no());
		builder.append(", getEmp_name()=");
		builder.append(getEmp_name());
		builder.append(", getDept_name()=");
		builder.append(getDept_name());
		builder.append(", getSalary()=");
		builder.append(getSalary());
		builder.append("]");
		return builder.toString();
	}

}
