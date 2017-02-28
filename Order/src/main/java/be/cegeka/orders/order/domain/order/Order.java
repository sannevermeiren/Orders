package be.cegeka.orders.order.domain.order;

import be.cegeka.orders.order.domain.customers.Customer;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sannev on 27/02/2017.
 */

@Entity(name = "CUSTOMER_ORDER")
@Table (name = "ORDERS")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDER_ID")
    private int orderid;
    @ManyToOne(cascade = CascadeType.ALL, targetEntity = Customer.class)
    @JoinColumn (name ="CUSTOMER_ID", referencedColumnName = "CUSTOMER_ID")
    private Customer customer;
    @Column (name = "ORDER_DATE")
    private LocalDate orderdate;
    @OneToMany (targetEntity = OrderItem.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID")
    private List<OrderItem> orderItems;

    public Order() {
        orderItems = new ArrayList<>();
    }

    public Order(Customer customer, LocalDate orderdate, List<OrderItem> orderITems) {
        this.customer = customer;
        this.orderdate = orderdate;
        this.orderItems = orderITems;
    }

    public int getOrderid() {
        return orderid;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDate getOrderdate() {
        return orderdate;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }
}
