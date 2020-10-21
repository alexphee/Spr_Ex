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

import myPack.test.entity.Storage;
import myPack.test.service.StorageService;

@RestController
public class StorageController {

 @Autowired
 private StorageService storageService;

 @GetMapping("/storages")
 public List<Storage> getAllStorages(){
	 return storageService.getAllStorages();
 }
 
 @GetMapping("/storages/{id}")
 public Storage getStorage(@PathVariable int id) {
	 return storageService.getStorage(id);
 }

 @PostMapping(value="/storages")
 public void addStorage(@RequestBody Storage storage) {
	 storageService.addStorage(storage);
 }
 @PutMapping(value="/storages/{id}")
 public void updateStorage(@RequestBody Storage storage, @PathVariable int id) {
	 storageService.updateStorage(id, storage);
 }
 @DeleteMapping(value="/storages/{id}")
 public void deleteStorage(@PathVariable int id) {
	  storageService.deleteStorage(id);
 }

}