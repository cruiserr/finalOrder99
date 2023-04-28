package edu.iu.c322.finalProject.orderservice.model.entity;

import edu.iu.c322.finalProject.orderservice.model.dto.PaymentDto;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "paymentGen")
    @SequenceGenerator(name = "paymentGen", sequenceName = "paymentSeq", allocationSize = 1)
    private int id;

    @NotEmpty(message = "method cannot be empty.")

    private String method;

    @NotEmpty(message = "card number cannot be empty.")

    private String cardNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "billing_address_id", referencedColumnName = "id")
    private CustomerBillingAddress billingAddress;

    public Payment() {
    }

    public Payment(PaymentDto paymentDto, CustomerBillingAddress billingAddress) {
        this.method = paymentDto.getMethod();
        this.cardNumber = paymentDto.getNumber();
        this.billingAddress = billingAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public CustomerBillingAddress getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(CustomerBillingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }
}