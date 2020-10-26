package myPack.test.service;

import java.util.Date;
import java.util.List;

import myPack.test.entity.ImpExp;
import myPack.test.entity.Orders;

public interface ImpExpService {	
	public List getAllImpExp();
	public ImpExp getImpExp (Integer id);
	public void addImpExp(ImpExp impexp);
	 public void updateImpExp(Integer id, ImpExp impexp);
	 public void deleteImpExp(Integer id); 
		/*
		 * int findByBarcode(int barcode, Date date);
		 */
	void saveOrder(Orders orders);
}
