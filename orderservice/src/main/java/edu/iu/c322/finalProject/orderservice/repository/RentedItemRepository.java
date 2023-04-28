package edu.iu.c322.finalProject.orderservice.repository;

import edu.iu.c322.finalProject.orderservice.model.entity.RentedItems;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RentedItemRepository extends JpaRepository<RentedItems, Integer> {
    @Query("SELECT oi FROM RentedItems oi WHERE oi.order.id = :orderId")
    List<RentedItems> findByOrderId(@Param("orderId") Integer orderId);

    /*
    @Query("SELECT oi FROM RentedItems oi WHERE oi.order = :order AND oi.item = :item")
    RentedItems findByOrderAndItem(@Param("order") Order order, @Param("item") Item item);


     */
    @Query("SELECT oi FROM RentedItems oi WHERE oi.order.id = :orderId")
    List<RentedItems> findAllByOrderId(@Param("orderId") Integer orderId);

}