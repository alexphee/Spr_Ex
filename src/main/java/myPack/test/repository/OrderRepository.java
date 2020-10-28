package myPack.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import myPack.test.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

}
