package edu.iu.c322.finalProject.orderservice.repository;

import edu.iu.c322.finalProject.orderservice.model.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
    List<Order> findByCustomerId(Integer customerId);

    Order findByid(Integer id);
}
