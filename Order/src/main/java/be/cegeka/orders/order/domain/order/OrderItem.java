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
    @ManyToOne
    @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID")
    private Order order;
    @OneToOne(targetEntity = Item.class)
    @JoinColumn (name = "ITEM_ID", referencedColumnName = "ITEM_ID")
    private Item item;
    @Column (name = "QUANTITY")
    private int quantity;
    @Column (name = "SHIPPING_DATE", columnDefinition = "DATE")
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
