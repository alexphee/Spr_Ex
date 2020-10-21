package myPack.test.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import myPack.test.entity.ImpExp;
import myPack.test.entity.Shelf;
import myPack.test.entity.Storage;
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

 @PostMapping( value="/impexp/{storageid}/{shelfid}")
 public void addImpExp(@RequestBody ImpExp impexp, @PathVariable int storageid, @PathVariable int shelfid) {
	 impexp.setShelf(new Shelf(shelfid," "));
	 impexp.setStorage(new Storage(storageid," "));
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
 @GetMapping("/stock/{barcode}/{date}")
	@ResponseBody
	public int findByBarcode(@PathVariable int barcode, @PathVariable Date date){
		
		return impexpService.findByBarcode(barcode,date);
	}
 
}