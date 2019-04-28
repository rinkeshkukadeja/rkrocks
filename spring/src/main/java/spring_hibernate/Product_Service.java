package spring_hibernate;

import java.util.List;

public interface Product_Service {

	public boolean addProduct(Product_Bean prod);
	public Product_Bean getProduct(int prodid);
	public List<Product_Bean> deleteProduct(int prodid);
	public Product_Bean updateProduct(Product_Bean prod);
	public List<Product_Bean> getAllProduct();
	
}
