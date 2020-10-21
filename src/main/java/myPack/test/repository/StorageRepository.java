package myPack.test.repository;

import org.springframework.data.repository.CrudRepository;

import myPack.test.entity.Storage;

public interface StorageRepository extends CrudRepository<Storage, Integer> {


}
