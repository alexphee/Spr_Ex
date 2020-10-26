package myPack.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import myPack.test.entity.Orders;

public interface OrderRepository extends JpaRepository<Orders, Integer> {

}
