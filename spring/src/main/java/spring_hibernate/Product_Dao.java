package spring_hibernate;

import java.util.List;

public interface Product_Dao {

	public boolean insertProduct(Product_Entity prod);
	public Product_Entity fetchProduct(int prodid);
	public List<Product_Entity> removeProduct(int prodid);
	public Product_Entity modifyProduct(Product_Entity prod);
	public List<Product_Entity> fetchAllProduct();
	
}
