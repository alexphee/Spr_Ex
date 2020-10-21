package myPack.test.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import myPack.test.entity.Storage;
import myPack.test.service.StorageService;

@RestController
public class StorageController {

 @Autowired
 private StorageService storageService;

 @RequestMapping("/storages")
 public List<Storage> getAllStorages(){
	 return storageService.getAllStorages();
 }
 
 @RequestMapping("/storages/{id}")
 public Storage getStorage(@PathVariable int id) {
	 return storageService.getStorage(id);
 }

 @RequestMapping(method=RequestMethod.POST, value="/storages")
 public void addStorage(@RequestBody Storage storage) {
	 storageService.addStorage(storage);
 }
 @RequestMapping(method=RequestMethod.PUT, value="/storages/{id}")
 public void updateStorage(@RequestBody Storage storage, @PathVariable int id) {
	 storageService.updateStorage(id, storage);
 }
 @RequestMapping(method=RequestMethod.DELETE, value="/storages/{id}")
 public void deleteStorage(@PathVariable int id) {
	  storageService.deleteStorage(id);
 }

}