package edu.iu.c322.finalProject.orderservice.model.entity;

import edu.iu.c322.finalProject.orderservice.model.dto.CustomerDto;
import jakarta.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customerGen")
    @SequenceGenerator(name = "customerGen", sequenceName = "customerSeq", allocationSize = 1)
    private int id;


    private String name;

    private String email;


    public Customer(){


    }
    public Customer(CustomerDto customerDto){
        this.name = customerDto.getName();
        this.email = customerDto.getEmail();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
