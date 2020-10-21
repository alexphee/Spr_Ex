package myPack.test.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import myPack.test.entity.Product;
import myPack.test.entity.Shelf;

public interface ProductRepository extends CrudRepository<Product, Integer> {

	public List<Product> findByShelfId(int shelfid);
}
