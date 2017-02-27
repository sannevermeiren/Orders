package be.cegeka.orders.order.domain.order;

import be.cegeka.orders.order.domain.items.Item;
import org.springframework.boot.autoconfigure.web.ResourceProperties;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table (name = "ITEMS_ON_ORDER")
public class OrderItem {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name ="IOO_ID")
    private int id;
    @Column (name = "ORDER_ID")
    @ManyToOne
    private Order order;
    @Column (name = "ITEM_ID")
    private Item item;
    @Column (name = "QUANTITY")
    private int quantity;
    @Column (name = "SHIPPINGDATE")
    private LocalDate shippingdate;

    public OrderItem() {
    }

    public int getId() {
        return id;
    }

    public Order getOrder() {
        return order;
    }

    public Item getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDate getShippingdate() {
        return shippingdate;
    }

    public OrderItem(Order order, Item item, int quantity) {
        this.order = order;
        this.item = item;
        this.quantity = quantity;
    }
}
