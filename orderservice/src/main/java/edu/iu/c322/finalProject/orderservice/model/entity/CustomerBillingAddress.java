package edu.iu.c322.finalProject.orderservice.model.entity;

import edu.iu.c322.finalProject.orderservice.model.dto.CustomerBillingAddressDto;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "customerBilling")
public class CustomerBillingAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "billingGen")
    @SequenceGenerator(name = "billingGen", sequenceName = "billingSeq", allocationSize = 1)
    private int id;

    @NotEmpty(message = "state cannot be empty.")

    private String state;

    @NotEmpty(message = "city cannot be empty.")

    private String city;

    @NotNull(message = "billing postal should not be empty")
    private Integer postalCode;

    private String street;

    public CustomerBillingAddress() {
    }

    public CustomerBillingAddress(CustomerBillingAddressDto billingAddressDto) {
        this.state = billingAddressDto.getState();
        this.city = billingAddressDto.getCity();
        this.postalCode = billingAddressDto.getPostalCode();
        this.street = billingAddressDto.getStreet();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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