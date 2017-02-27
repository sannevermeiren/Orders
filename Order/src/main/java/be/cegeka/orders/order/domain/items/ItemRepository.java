package be.cegeka.orders.order.domain.items;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by kevinbi on 27/02/2017.
 */
@Named
public class ItemRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Item> getAllItems() {
        return entityManager.createQuery("select i from Item i",Item.class).getResultList();
    }

    public void addItem(Item item) {
        entityManager.persist(item);
    }
}
