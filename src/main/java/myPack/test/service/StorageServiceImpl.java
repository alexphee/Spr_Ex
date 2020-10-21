package myPack.test.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myPack.test.entity.Storage;
import myPack.test.repository.StorageRepository;

@Service
public class StorageServiceImpl implements StorageService {
	
 @Autowired
 private StorageRepository storageRepo; 

@Override
public List<Storage> getAllStorages() {
	List<Storage> storageList = new ArrayList<>();
	  storageRepo.findAll().forEach(storageList::add);
	  return storageList;
}
	 
 @Override
public Storage getStorage(Integer id) {
	 return storageRepo.findById(id).orElse(null);}
 
@Override
public void addStorage(Storage storage) {
	storageRepo.save(storage);
}

@Override
public void updateStorage(Integer id, Storage storage) {
	storageRepo.save(storage);
}
@Override
public void deleteStorage(Integer id) {
	storageRepo.deleteById(id);
}

 }

