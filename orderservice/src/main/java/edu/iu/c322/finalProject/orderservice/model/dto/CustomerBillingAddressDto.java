package edu.iu.c322.finalProject.orderservice.model.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class CustomerBillingAddressDto {

    @NotEmpty(message = "state cannot be empty.")

    private String state;

    @NotEmpty(message = "city cannot be empty.")

    private String city;

    @NotNull(message = "billing postal should not be empty")
    private Integer postalCode;

    private String street;
    public CustomerBillingAddressDto() {
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}