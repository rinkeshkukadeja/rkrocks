package autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_Autowiring {

	public static void main(String[] args) {
		
		ApplicationContext appcon = new ClassPathXmlApplicationContext("/spring3.xml");
		Employee1 emp1= (Employee1) appcon.getBean("emp");
		System.out.println(emp1.getAddr1().toString());
		//System.out.println(emp1.getAddr2().toString());
		/*System.out.println(emp1.getAddr2().toString());
		System.out.println(emp1.getAddr3().toString());
		System.out.println(emp1.getAddr4().toString());
		System.out.println(emp1.getAddr5().toString());*/
	}
}
