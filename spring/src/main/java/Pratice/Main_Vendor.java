package Pratice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_Vendor {

	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("/spring5.xml");
		Vendor vend = (Vendor) app.getBean("vend");
		Vendor vend3 = (Vendor) app.getBean("vend");
		Vend_supp vend2 = (Vend_supp) app.getBean("vend2");
		System.out.println(vend.hashCode());
		System.out.println(vend3.hashCode());
		System.out.println(vend2);
	
		
		
	}

}
