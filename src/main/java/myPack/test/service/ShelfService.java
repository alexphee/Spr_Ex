package myPack.test.service;

import java.util.List;

import myPack.test.entity.Shelf;

public interface ShelfService {	
	public List getAllShelves();
	public Shelf getShelf(Integer id);
	public void addShelf(Shelf shelf);
	 public void updateShelf(Shelf shelf);
	 public void deleteShelf(Integer id); 
	
	
}
