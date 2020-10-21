package myPack.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import myPack.test.entity.Shelf;
import myPack.test.entity.Storage;
import myPack.test.service.ShelfService;

@RestController
public class ShelfController {

 @Autowired
 private ShelfService shelfService;

 @RequestMapping("/shelves")
 public List<Shelf> getAllShelves(){
	 return shelfService.getAllShelves();
 }
 
 @RequestMapping("/shelves/{id}")
 public Shelf getShelf(@PathVariable int id) {
	 return shelfService.getShelf(id);
 }

 @RequestMapping(method=RequestMethod.POST, value="/shelves")
 public void addShelf(@RequestBody Shelf shelf) {
	 shelfService.addShelf(shelf);
 }
 @RequestMapping(method=RequestMethod.PUT, value="/shelves/{id}")
 public void updateShelf(@RequestBody Shelf shelf,@PathVariable int storageId, @PathVariable int id) {
	 shelfService.updateShelf(shelf);
 }
 @RequestMapping(method=RequestMethod.DELETE, value="/shelves/{id}")
 public void deleteShelf(@PathVariable int id) {
	  shelfService.deleteShelf(id);
 }

}