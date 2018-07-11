package kr.jaen.spring.di;

import java.io.Serializable;

public class Employee implements Serializable{
	private int snum;
	private String sname;
	private int salary;
	private String img;
	public Employee() {
		super();
	}
	public Employee(int snum, String sname, int salary) {
		super();
		this.snum = snum;
		this.sname = sname;
		this.salary = salary;
	}
	public Employee(int snum, String sname, int salary, String img) {
		super();
		this.snum = snum;
		this.sname = sname;
		this.salary = salary;
		this.img=img;
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
	
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [snum:");
		builder.append(getSnum());
		builder.append(", sname:");
		builder.append(getSname());
		builder.append(", salary:");
		builder.append(getSalary());
		builder.append(", img:");
		builder.append(getImg());
		builder.append("]");
		return builder.toString();
	}
	
}
