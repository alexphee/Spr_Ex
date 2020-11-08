package myPack.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import myPack.test.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	public List<Product> findByShelfId(int shelfid);
}
