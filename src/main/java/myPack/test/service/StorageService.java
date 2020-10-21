package myPack.test.service;

import java.util.List;
import myPack.test.entity.Storage;

public interface StorageService {	
	public List getAllStorages();
	public Storage getStorage(Integer id);
	public void addStorage(Storage storage);
	 public void updateStorage(Integer id, Storage storage);
	 public void deleteStorage(Integer id);

	
	
}
