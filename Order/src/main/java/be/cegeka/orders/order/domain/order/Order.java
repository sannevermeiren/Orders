package be.cegeka.orders.order.domain.order;

import be.cegeka.orders.order.domain.customers.Customer;
import org.springframework.boot.autoconfigure.web.ResourceProperties;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sannev on 27/02/2017.
 */

@Entity(name = "CUSTOMER_ORDER")
@Table (name = "ORDER")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDER_ID")
    private int orderid;
    @Column (name ="CUSTOMER_ID")
    private Customer customer;
    @Column (name = "ORDER_DATE")
    private LocalDate orderdate;
    @Column (name = "ORDER_ITEMS")
    @OneToMany (targetEntity = OrderItem.class, cascade = CascadeType.ALL)
    private List<OrderItem> orderITems;

    public Order() {
        orderITems = new ArrayList<>();
    }

    public Order(Customer customer, LocalDate orderdate, List<OrderItem> orderITems) {
        this.customer = customer;
        this.orderdate = orderdate;
        this.orderITems = orderITems;
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

    public List<OrderItem> getOrderITems() {
        return orderITems;
    }
}
