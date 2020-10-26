package myPack.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import myPack.test.entity.ImpExp;
import myPack.test.entity.Orders;
import myPack.test.entity.OrdersWrapper;
import myPack.test.service.ImpExpService;

@RestController
public class ImpExpController {

 @Autowired
 private ImpExpService impexpService;

 @GetMapping("/impexp")
 public List<ImpExp> getAllImpExp(){
	 return impexpService.getAllImpExp();
 }
 
 @GetMapping("/impexp/{id}")
 public ImpExp getImpExp(@PathVariable int id) {
	 return impexpService.getImpExp(id);
 }

 
  
 @PostMapping( value="/impexp",consumes="application/json",produces="application/json")
 public void addImpExp(@RequestBody ImpExp impexp, @RequestBody OrdersWrapper wrapper) {
	 for(Orders orders : wrapper.getOrders()) {
		 impexpService.saveOrder(orders);
	 }
	 impexpService.addImpExp(impexp);
 }
 
 
 
 @PutMapping(value="/impexp/{id}")
 public void updateImpExp(@RequestBody ImpExp impexp, @PathVariable int id) {
	 impexpService.updateImpExp(id, impexp);
 }
 @DeleteMapping(value="/impexp/{id}")
 public void deleteImpExp(@PathVariable int id) {
	  impexpService.deleteImpExp(id);
 }
 
	/*
	 * @GetMapping("/stock/{barcode}/{date}")
	 * 
	 * @ResponseBody public int findByBarcode(@PathVariable int
	 * barcode, @PathVariable @DateTimeFormat(iso=DateTimeFormat.ISO.DATE) Date date
	 * ){
	 * 
	 * return impexpService.findByBarcode(barcode,date); }
	 */
  
 }

