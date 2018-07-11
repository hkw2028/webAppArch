package kr.jaen.spring.di;

public class Employee {
	private int snum;
	private String sname;
	private int salary;
	public Employee() {
		super();
	}
	public Employee(int snum, String sname, int salary) {
		setSnum(snum);
		setSname(sname);
		setSalary(salary);
	}
	public int getSnum() {
		return snum;
	}
	public void setSnum(int snum) {
		this.snum = snum;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
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
		builder.append("Employee [getSnum()=");
		builder.append(getSnum());
		builder.append(", getSname()=");
		builder.append(getSname());
		builder.append(", getSalary()=");
		builder.append(getSalary());
		builder.append("]");
		return builder.toString();
	}
	
}
