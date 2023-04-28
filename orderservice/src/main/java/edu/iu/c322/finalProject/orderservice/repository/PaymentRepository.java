package edu.iu.c322.finalProject.orderservice.repository;

import edu.iu.c322.finalProject.orderservice.model.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
