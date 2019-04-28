package collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main_test {

	public static void main(String[] args) {
		
		ApplicationContext appcont = new ClassPathXmlApplicationContext("/spring2.xml");		
		Employee_collection con= (Employee_collection) appcont.getBean("abc");
		
		System.out.println(con.l1);
	}

}
