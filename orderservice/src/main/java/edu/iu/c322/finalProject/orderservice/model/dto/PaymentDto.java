package edu.iu.c322.finalProject.orderservice.model.dto;

import jakarta.validation.constraints.NotEmpty;

public class PaymentDto {

    @NotEmpty(message = "method cannot be empty.")

    private String method;

    @NotEmpty(message = "card number cannot be empty.")

    private String number;
    private CustomerBillingAddressDto billingAddress;

    public PaymentDto() {
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public CustomerBillingAddressDto getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(CustomerBillingAddressDto billingAddress) {
        this.billingAddress = billingAddress;
    }
}