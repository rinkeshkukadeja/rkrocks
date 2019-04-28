package com.scp.pratice.hibernate.spring;

import java.io.File;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Main_Test {

	public static void main(String[] args) {
	
		//----------------- Application Context setter injection -------------------------
		ApplicationContext app = new ClassPathXmlApplicationContext("/spring.xml");
		Employee e1 = (Employee) app.getBean("emp");
		System.out.println(e1);
		
		Employee e4 = (Employee) app.getBean("emp");
		System.out.println(e4);
		
		System.out.println("e1................"+e1.hashCode()+"e4.............."+e4.hashCode());
		
		System.out.println(e1==e4); // trlue
		System.out.println(e1.getEmp_id()== e4.getEmp_id());
		System.out.println(e1.equals(e4));
		
		//------------------- object injection ----------------------------------------------
		//Address a1 = (Address) app.getBean("adr");
		//System.out.println(a1);
		// alias name is used 
		Address a2 = (Address) app.getBean("address2");
		System.out.println(a2);
		
		
		//------------------- Bean  factory  setter injection ----------------------------------
		BeanFactory beanfa = new XmlBeanFactory(new FileSystemResource("D:\\Java Projects\\spring\\src\\main\\java\\spring.xml"));
		Employee e3 = (Employee)beanfa.getBean("emp");
		System.out.println(e3);
		
		Employee e5 = (Employee)beanfa.getBean("emp");
		System.out.println(e5);
		System.out.println(e3==e5);//true
		
		//------------------- Application context constructor injection ---------------------------------
		
		ApplicationContext app1 = new ClassPathXmlApplicationContext("/spring.xml");
		Constructor_injection con= (Constructor_injection) app1.getBean("emp2");
		System.out.println(con);
		
		
		
	}

}
