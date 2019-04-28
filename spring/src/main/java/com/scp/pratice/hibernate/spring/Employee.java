package com.scp.pratice.hibernate.spring;

public class Employee {

	private int emp_id;
	private String emp_name;
	private Address addr;
	private Address addr2;
	
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	
	
	public Employee() {
		super();
	}
	public Address getAddr2() {
		return addr2;
	}
	public void setAddr2(Address addr2) {
		this.addr2 = addr2;
	}
	public Employee(int emp_id, String emp_name, Address addr, Address addr2) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.addr = addr;
		this.addr2 = addr2;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", addr=" + addr + ", addr2=" + addr2 + "]";
	}
	
}
