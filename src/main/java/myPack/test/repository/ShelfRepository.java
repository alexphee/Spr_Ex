package myPack.test.repository;

import org.springframework.data.repository.CrudRepository;

import myPack.test.entity.Shelf;

public interface ShelfRepository extends CrudRepository<Shelf, Integer> {

}
