package be.cegeka.orders.order;

import be.cegeka.orders.order.controllers.*;
import be.cegeka.orders.order.domain.customers.CustomerRepositoryTest;
import be.cegeka.orders.order.domain.items.ItemRepositoryTest;
import be.cegeka.orders.order.services.CustomerServiceTest;
import be.cegeka.orders.order.services.ItemServiceTest;
import be.cegeka.orders.order.services.OrderServiceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AdminControllerTest.class,
        CustomerControllerTest.class,
        ItemControllerTest.class,
        OrderControllerTest.class,
        CustomerRepositoryTest.class,
        ItemRepositoryTest.class,
        CustomerServiceTest.class,
        ItemServiceTest.class,
        OrderServiceTest.class
})
public class AllTests {
}
