package myPack.test.service;

import java.util.List;

import myPack.test.entity.ImpExp;

public interface ImpExpService {	
	public List getAllImpExp();
	public ImpExp getImpExp (Integer id);
	public void addImpExp(ImpExp impexp);
	 public void updateImpExp(Integer id, ImpExp impexp);
	 public void deleteImpExp(Integer id); 
	    int findByBarcode(int barcode, int date);

}
