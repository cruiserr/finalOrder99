package edu.iu.c322.finalProject.orderservice.model.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class ItemsDto {

    private int itemID;
    @NotEmpty(message = "name cannot be empty.")

    private String name;
    @NotNull(message = "price cannot be empty.")

    private Double price;

    @NotNull(message = "quantity cannot be empty.")

    private int quantity;

    private String dateRented;

    private String returnByDate;


    public ItemsDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
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
