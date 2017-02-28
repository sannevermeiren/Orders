package be.cegeka.orders.order.domain.items;

import org.springframework.stereotype.Repository;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ItemRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Item> getAllItems() {
        return entityManager.createQuery("select i from Item i",Item.class).getResultList();
    }

    public void addItem(Item item) {
        entityManager.persist(item);
    }

    public Item findItemById(int id) {
        return entityManager.find(Item.class, id);
    }
}
