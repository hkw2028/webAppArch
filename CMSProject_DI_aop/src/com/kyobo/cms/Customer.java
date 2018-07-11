package com.kyobo.cms;


public class Customer {
	private int num;
	private String name;
	private String address;

	public Customer(int num, String name, String address) {
		super();
		this.num = num;
		this.name = name;
		this.address = address;
	}

	public Customer() {
		super();
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [num=");
		builder.append(num);
		builder.append(", name=");
		builder.append(name);
		builder.append(", address=");
		builder.append(address);
		builder.append("]");
		return builder.toString();
	}

}
