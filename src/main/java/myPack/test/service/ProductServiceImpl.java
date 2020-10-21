package myPack.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myPack.test.entity.Product;
import myPack.test.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
 @Autowired
 private ProductRepository productRepo; 

@Override
public List<Product> getAllProducts() {
	List<Product> productList = new ArrayList<>();
	  productRepo.findAll().forEach(productList::add);
	  return productList;
}
	 
 @Override
public Product getProduct(Integer id) {
	 return productRepo.findById(id).orElse(null);}
 
@Override
public void addProduct(Product product) {
	productRepo.save(product);
}

@Override
public void updateProduct(Product product) {
	productRepo.save(product);
}
@Override
public void deleteProduct(Integer id) {
	productRepo.deleteById(id);
}

 }

