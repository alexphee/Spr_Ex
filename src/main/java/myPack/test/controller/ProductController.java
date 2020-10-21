package myPack.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import myPack.test.entity.Product;
import myPack.test.entity.Shelf;
import myPack.test.entity.Storage;
import myPack.test.service.ProductService;
import myPack.test.service.ShelfService;

@RestController
public class ProductController {

 @Autowired
 private ProductService productService;
@Autowired
private ShelfService shelfService;
 @GetMapping("/products")
 public List<Product> getAllProducts(){
	 return productService.getAllProducts();
 }
 
 @GetMapping("/products/{id}")
 public Product getProduct(@PathVariable int id) {
	 return productService.getProduct(id);
 }

 @PostMapping(value="/products/{storageid}/{shelfid}")
 public void addProduct(@RequestBody Product product, @PathVariable int storageid, @PathVariable int shelfid){
	 product.setShelf(new Shelf(shelfid," "));
	 product.setStorage(new Storage(storageid," "));
	 productService.addProduct(product);
 }

 @DeleteMapping(value="/products/{id}")
 public void deleteProduct(@PathVariable int id) {
	  productService.deleteProduct(id);
 }

}