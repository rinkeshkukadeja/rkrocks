package spring_hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("daoob")
public class Product_Dao_Impl implements Product_Dao{

	@Autowired
	SessionFactory sfactory;
	
	
	public SessionFactory getSfactory() {
		return sfactory;
	}

	public void setSfactory(SessionFactory sfactory) {
		this.sfactory = sfactory;
	}

	public boolean insertProduct(Product_Entity prod) {
		System.out.println("trying to insert the elements ");
		SessionFactory sessionfactory = getSfactory();
		Session session = sessionfactory.openSession();
		Transaction tr= session.beginTransaction();
		session.save(prod);
		tr.commit();
		return true;
	}

	public Product_Entity fetchProduct(int prodid) {
		SessionFactory sessionfactory = getSfactory();
		Session session = sessionfactory.openSession();
		Transaction tr= session.beginTransaction();
		Product_Entity entity= session.get(Product_Entity.class, prodid);
		return entity;
	}

	public List<Product_Entity> removeProduct(int prodid) {
		return null;
	}

	public Product_Entity modifyProduct(Product_Entity prod) {
		return null;
	}

	public List<Product_Entity> fetchAllProduct() {
		return null;
	}



}
