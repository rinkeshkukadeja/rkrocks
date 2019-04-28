package com.scp.pratice.hibernate.spring;

public class Constructor_injection {

	private int emp_id1;
	private String emp_name1;
	public Constructor_injection(int emp_id1, String emp_name1) {
		super();
		this.emp_id1 = emp_id1;
		this.emp_name1 = emp_name1;
	}
	
	
	public int getEmp_id1() {
		return emp_id1;
	}

	public String getEmp_name1() {
		return emp_name1;
	}


	@Override
	public String toString() {
		return "Constructor_injection [emp_id1=" + emp_id1 + ", emp_name1=" + emp_name1 + "]";
	}

	
	
}
