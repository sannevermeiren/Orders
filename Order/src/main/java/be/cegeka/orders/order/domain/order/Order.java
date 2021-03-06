package be.cegeka.orders.order.domain.order;

import be.cegeka.orders.order.domain.customers.Customer;

import javax.persistence.*;
import java.time.LocalDate;

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
    @OneToOne (targetEntity = OrderItem.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID")
    private OrderItem orderItem;

    public Order() {
    }

    public Order(Customer customer, OrderItem orderItem) {
        this.customer = customer;
        this.orderdate = LocalDate.now();
        this.orderItem = orderItem;
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

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }
}
