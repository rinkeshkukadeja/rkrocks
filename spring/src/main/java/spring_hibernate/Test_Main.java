package spring_hibernate;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test_Main {

	public static void main(String[] args) {

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(Product_Configuration.class);
		Product_Service_Impl service = (Product_Service_Impl) context.getBean("service_ob");
/*		Product_Dao_Impl daoImpl = (Product_Dao_Impl) service.getProductdao();
		SessionFactory sessionFactory = daoImpl.getSfactory();*/
		Product_Bean pb = new Product_Bean(1,"sb0",10.0d);
		service.addProduct(pb);
		service.getProduct(1);
		
		System.out.println(service.hashCode());
		/*System.out.println(daoImpl.hashCode());
		System.out.println(sessionFactory.hashCode());*/
		
	}
}
