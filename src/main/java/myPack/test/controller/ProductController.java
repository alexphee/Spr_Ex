package myPack.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import myPack.test.entity.Product;
import myPack.test.entity.Shelf;
import myPack.test.entity.Storage;
import myPack.test.service.ProductService;

@RestController
public class ProductController {

 @Autowired
 private ProductService productService;

 @RequestMapping("/products")
 public List<Product> getAllProducts(){
	 return productService.getAllProducts();
 }
 
 @RequestMapping("/products/{id}")
 public Product getProduct(@PathVariable int id) {
	 return productService.getProduct(id);
 }

 @RequestMapping(method=RequestMethod.POST, value="/products/{storageid}/{shelfid}")
 public void addProduct(@RequestBody Product product, @PathVariable int storageid, @PathVariable int shelfid){
	 product.setShelf(new Shelf(shelfid," "));
	 product.setStorage(new Storage(storageid," "));
	 productService.addProduct(product);
 }

 @RequestMapping(method=RequestMethod.DELETE, value="/products/{id}")
 public void deleteProduct(@PathVariable int id) {
	  productService.deleteProduct(id);
 }

}