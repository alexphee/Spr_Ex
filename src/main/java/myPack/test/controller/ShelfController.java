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

import myPack.test.entity.Shelf;
import myPack.test.service.ShelfService;

@RestController
public class ShelfController {

 @Autowired
 private ShelfService shelfService;

 @GetMapping("/shelves")
 public List<Shelf> getAllShelves(){
	 return shelfService.getAllShelves();
 }
 
 @GetMapping("/shelves/{id}")
 public Shelf getShelf(@PathVariable int id) {
	 return shelfService.getShelf(id);
 }

 @PostMapping(value="/shelves")
 public void addShelf(@RequestBody Shelf shelf) {
	 shelfService.addShelf(shelf);
 }
 @PutMapping(value="/shelves/{id}")
 public void updateShelf(@RequestBody Shelf shelf,@PathVariable int storageId, @PathVariable int id) {
	 shelfService.updateShelf(shelf);
 }
 @DeleteMapping(value="/shelves/{id}")
 public void deleteShelf(@PathVariable int id) {
	  shelfService.deleteShelf(id);
 }

}