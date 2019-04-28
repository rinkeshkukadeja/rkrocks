package spring_hibernate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("service_ob")
public class Product_Service_Impl implements  Product_Service{

	@Autowired
	Product_Dao productdao;
	
	public Product_Dao getProductdao() {
		return productdao;
	}

	public void setProductdao(Product_Dao productdao) {
		this.productdao = productdao;
	}

	public boolean addProduct(Product_Bean prod) {	
		Product_Entity entity= convertBeanToEntity(prod);
		return productdao.insertProduct(entity);
	}

	public Product_Bean getProduct(int prodid) {
	
		Product_Entity entity= productdao.fetchProduct(prodid);
		Product_Bean bean = convertEntitytobean(entity);
		System.out.println(bean);
		return null;
		
	}

	public List<Product_Bean> deleteProduct(int prodid) {
		return null;
	}

	public Product_Bean updateProduct(Product_Bean prod) {
		return null;
	}

	public List<Product_Bean> getAllProduct() {
		return null;
	}
	
	private Product_Entity convertBeanToEntity(Product_Bean bean){
		Product_Entity entity = new Product_Entity();
		entity.setProductId(bean.getProductId());
		entity.setProductName(bean.getProductName());
		entity.setProductPrice(bean.getProductPrice());
		return entity;
	}
	
	private Product_Bean convertEntitytobean(Product_Entity entity){
		Product_Bean bean = new Product_Bean();
		bean.setProductId(entity.getProductId());
		bean.setProductName(entity.getProductName());
		bean.setProductPrice(entity.getProductPrice());
		return bean;
	}
		
}
