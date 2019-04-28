package hibernate_spring;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class hibernate_maping {

	public static void main(String[] args) {

		Employee emp1 = new Employee(1, "rinkesh");
		Employee emp2 = new Employee(3, "rakesh");
		ApplicationContext app = new ClassPathXmlApplicationContext("/bean.xml");
		SessionFactory sess = (SessionFactory) app.getBean("sessionFactory");
		Session s = sess.openSession();
		Transaction tr = s.beginTransaction();
		tr.commit();
	}
}
