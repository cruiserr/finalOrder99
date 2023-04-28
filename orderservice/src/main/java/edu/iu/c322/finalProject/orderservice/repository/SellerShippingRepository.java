package edu.iu.c322.finalProject.orderservice.repository;

import edu.iu.c322.finalProject.orderservice.model.entity.SellerShippingAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerShippingRepository extends JpaRepository<SellerShippingAddress, Integer> {
}