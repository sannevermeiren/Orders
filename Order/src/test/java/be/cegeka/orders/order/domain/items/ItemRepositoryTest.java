package be.cegeka.orders.order.domain.items;

import be.cegeka.orders.order.OrderApplication;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * Created by kevinbi on 27/02/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = OrderApplication.class)
@Transactional
public class ItemRepositoryTest {
    @PersistenceContext
    private EntityManager entityManager;
    @Inject
    private ItemRepository itemRepository;
    private Item item1, item2 ;

    @Before
    public void setUpDatabase(){
        this.item1 = new Item("Smurfen","Kleine standbeeldjes", 4.50);
        this.item2 = new Item("Daltons","Kleine criminelen",5.50);
        entityManager.persist(item1);
        entityManager.persist(item2);

    }

    @Test
    public void getAllShouldReturnAllItems()throws Exception{
        Assertions.assertThat(itemRepository.getAllItems()).contains(item1,item2);
    }
}
