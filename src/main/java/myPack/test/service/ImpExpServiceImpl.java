package myPack.test.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myPack.test.entity.ImpExp;
import myPack.test.entity.Order;
import myPack.test.repository.ImpExpRepository;
import myPack.test.repository.OrderRepository;
@Service
public class ImpExpServiceImpl implements ImpExpService {
	
 @Autowired
 private ImpExpRepository impexpRepo; 
 @Autowired
 private OrderRepository orderRepo;

@Override
public List<ImpExp> getAllImpExp() {
	List<ImpExp> impexpList = new ArrayList<>();
	  impexpRepo.findAll().forEach(impexpList::add);
	  return impexpList;
}
	 
 @Override
public ImpExp getImpExp(Integer id) {
	 return impexpRepo.findById(id).orElse(null);}
 
@Override
public ImpExp addImpExp(ImpExp impexp) {
	for(Order order: impexp.getOrders()) {
		order.setImpexp(impexp);
	}
	return impexpRepo.save(impexp);
}

@Override
public void updateImpExp(Integer id, ImpExp impexp) {
	impexpRepo.save(impexp);
}
@Override
public void deleteImpExp(Integer id) {
	impexpRepo.deleteById(id);
	
}

}


