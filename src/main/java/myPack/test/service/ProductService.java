package myPack.test.service;

import java.util.List;

import myPack.test.entity.Product;

public interface ProductService {	
	public List getAllProducts();
	public Product getProduct(Integer id);
	public void addProduct(Product product);
	 public void updateProduct(Product product);
	 public void deleteProduct(Integer id); 
	
	
}
