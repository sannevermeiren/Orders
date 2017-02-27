package be.cegeka.orders.order.domain.items;

import javax.persistence.*;

/**
 * Created by kevinbi on 27/02/2017.
 */
@Entity
@Table(name = "ITEMS")
public class Item {

    @Column(name = "NAME")
   private String name;
    @Column(name = "DESCRIPTION", columnDefinition = "TEXT")
   private String description;
    @Column(name = "SELLING_PRICE", columnDefinition = "DECIMAL(10,2)")
   private double price;
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "ITEM_ID")
   private int id;

    public int getId() {
        return id;
    }

    public Item() {
    }

    public Item(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (Double.compare(item.price, price) != 0) return false;
        if (id != item.id) return false;
        if (name != null ? !name.equals(item.name) : item.name != null) return false;
        return description != null ? description.equals(item.description) : item.description == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + id;
        return result;
    }
}
