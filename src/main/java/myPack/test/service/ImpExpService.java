package myPack.test.service;

import java.util.Date;
import java.util.List;

import myPack.test.entity.ImpExp;
import myPack.test.entity.Order;

public interface ImpExpService {	
	public List getAllImpExp();
	public ImpExp getImpExp (Integer id);
	public void addImpExp(ImpExp impexp, List<Order> orders);
	 public void updateImpExp(Integer id, ImpExp impexp);
	 public void deleteImpExp(Integer id); 
		/*
		 * int findByBarcode(int barcode, Date date);
		 */
}
