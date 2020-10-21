package myPack.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myPack.test.entity.Shelf;
import myPack.test.repository.ShelfRepository;

@Service
public class ShelfServiceImpl implements ShelfService {
	
 @Autowired
 private ShelfRepository shelfRepo; 

@Override
public List<Shelf> getAllShelves() {
	List<Shelf> shelfList = new ArrayList<>();
	  shelfRepo.findAll().forEach(shelfList::add);
	  return shelfList;
}
	 
 @Override
public Shelf getShelf(Integer id) {
	 return shelfRepo.findById(id).orElse(null);}
 
@Override
public void addShelf(Shelf shelf) {
	shelfRepo.save(shelf);
}

@Override
public void updateShelf(Shelf shelf) {
	shelfRepo.save(shelf);
}
@Override
public void deleteShelf(Integer id) {
	shelfRepo.deleteById(id);
}

 }

