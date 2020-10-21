package myPack.test.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import myPack.test.entity.Shelf;

public interface ShelfRepository extends CrudRepository<Shelf, Integer> {

}
