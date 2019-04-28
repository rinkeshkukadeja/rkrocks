package Callbacks;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean ,DisposableBean{

	private int stud_id;
	private String stud_name;
		
	public Student() {

	}

	public Student(int stud_id, String stud_name) {
		super();
		this.stud_id = stud_id;
		this.stud_name = stud_name;
	}
	
	public int getStud_id() {
		return stud_id;
	}

	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}

	public String getStud_name() {
		return stud_name;
	}
	
	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}
	
	@Override
	public String toString() {
		return "Student [stud_id=" + stud_id + ", stud_name=" + stud_name + "]";
	}
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("here i am ......");	
	}
	
	public void setme()
	{
		System.out.println("here i am set me method ......");
	}

	public void destroyme()
	{
		System.out.println("here i am destroy me method ......");
	}

	public void destroy() throws Exception {
		
		System.out.println("ending ......");	
	}
}
