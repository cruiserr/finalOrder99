package edu.iu.c322.finalProject.orderservice.model.entity;

import edu.iu.c322.finalProject.orderservice.model.dto.CustomerShippingAddressDto;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "customerShipping")
public class CustomerShippingAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "shippingGen")
    @SequenceGenerator(name = "shippingGen", sequenceName = "shippingSeq", allocationSize = 1)
    private int id;




    @NotEmpty(message = "shipping state cannot be empty.")

    private String state;

    @NotEmpty(message = "shipping city cannot be empty.")

    private String city;

    @NotNull(message = "shipping postal should not be empty")

    private int postalCode;

    private String street;

    public CustomerShippingAddress() {
    }

    public CustomerShippingAddress(CustomerShippingAddressDto addressDto) {
        this.state = addressDto.getState();
        this.city = addressDto.getCity();
        this.postalCode = addressDto.getPostalCode();
        this.street = addressDto.getStreet();
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

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
