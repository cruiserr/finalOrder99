package edu.iu.c322.finalProject.orderservice.model.entity;


import edu.iu.c322.finalProject.orderservice.model.dto.OrderDto;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ooiGen")
    @SequenceGenerator(name = "ooiGen", sequenceName = "oorderIdSeq", allocationSize = 1)
    private int id;



    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_Id", referencedColumnName = "id")
    private Customer customer;


    private int sellerId;

    private int total;

    private String dateRented;

    private String returnByDate;


    //rentedItems

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "shippingAddressId", referencedColumnName = "id")
    private CustomerShippingAddress customerAddress;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "paymentMethodId", referencedColumnName = "id")
    private Payment paymentMethod;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sellerShippingAddressId", referencedColumnName = "id")
    private SellerShippingAddress sellerShipping;

    public Order(){

    }

    public Order(OrderDto orderDto, Customer customer, SellerShippingAddress sellerAddress, Payment payment, CustomerShippingAddress customerShipping) {
        this.customer = customer;
        this.total = orderDto.getTotal();
        this.dateRented = orderDto.getItemsRented().get(0).getDateRented();
        this.returnByDate = orderDto.getItemsRented().get(0).getReturnByDate();;
        this.sellerShipping = sellerAddress;
        this.customerAddress = customerShipping;
        this.paymentMethod = payment;
        this.sellerId = orderDto.getSellerId();


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
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

    public CustomerShippingAddress getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(CustomerShippingAddress customerAddress) {
        this.customerAddress = customerAddress;
    }

    public Payment getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Payment paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public SellerShippingAddress getSellerShipping() {
        return sellerShipping;
    }

    public void setSellerShipping(SellerShippingAddress sellerShipping) {
        this.sellerShipping = sellerShipping;
    }

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }
}
