package edu.iu.c322.finalProject.orderservice.model.entity;

import edu.iu.c322.finalProject.orderservice.model.dto.ItemsDto;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "rentedItems")
public class RentedItems {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rentedItemsGen")
    @SequenceGenerator(name = "rentedItemsGen", sequenceName = "rentedItemsSeq", allocationSize = 1)
    private int id;

    @ManyToOne()
    @JoinColumn(name = "order_Id")
    private Order order;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_Id", referencedColumnName = "id")
    private Customer customer;


    private int itemId;


    private String name;

    private double price;
    @NotNull(message = "quantity should not be null")
    private Integer quantity;


    private String dateRented;

    private String returnByDate;

    public RentedItems() {
    }

    public RentedItems(Order order, ItemsDto item, Customer customer) {
        this.order = order;
        this.customer = customer;
        this.itemId = item.getItemID();
        this.name = item.getName();
        this.quantity = item.getQuantity();
        this.price = item.getPrice();
        this.dateRented = item.getDateRented();
        this.returnByDate = item.getReturnByDate();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getDateRented() {
        return dateRented;
    }

    public void setDateRented(String dateRented) {
        this.dateRented = dateRented;
    }

    public String getReturnByDate() {
        return returnByDate;
    }

    public void setReturnByDate(String returnByDate) {
        this.returnByDate = returnByDate;
    }
}