package edu.iu.c322.finalProject.orderservice.model.dto;

import java.util.List;

public class OrderDto {

    private CustomerDto customer;


    private int total;

    private CustomerShippingAddressDto shippingAddress;

    private SellerShippingAddressDto sellerShippingAddress;

    private List<ItemsDto> itemsRented;

    private PaymentDto payment;

    public OrderDto(){

    }


    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public CustomerShippingAddressDto getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(CustomerShippingAddressDto shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public List<ItemsDto> getItemsRented() {
        return itemsRented;
    }

    public void setItemsRented(List<ItemsDto> itemsRented) {
        this.itemsRented = itemsRented;
    }

    public PaymentDto getPayment() {
        return payment;
    }

    public void setPayment(PaymentDto payment) {
        this.payment = payment;
    }


    public SellerShippingAddressDto getSellerShippingAddress() {
        return sellerShippingAddress;
    }

    public void setSellerShippingAddress(SellerShippingAddressDto sellerShippingAddress) {
        this.sellerShippingAddress = sellerShippingAddress;
    }

    public CustomerDto getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDto customer) {
        this.customer = customer;
    }


}
