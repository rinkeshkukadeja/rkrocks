package Callbacks;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_Callbacks {

	public static void main(String[] args) {
		
		System.out.println("program started .....");
		AbstractApplicationContext con = new ClassPathXmlApplicationContext("/spring4.xml");
		con.registerShutdownHook();
		Student st= (Student) con.getBean("stud1");
		System.out.println(st);
		con.close();
	}
}
