package be.cegeka.orders.order.services;

import be.cegeka.orders.order.domain.order.OrderRepository;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.verify;

public class OrderServiceTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private OrderService orderService;

    @Mock
    private CustomerService customerService;
    @Mock
    private ItemService itemService;
    @Mock
    private OrderRepository orderRepository;

    @Test
    public void insertNewOrder_callsFindCustomerByIdAndFindItemById() {
        orderService.insertNewOrder(123, 1, 2);

        verify(customerService).findCustomerById(123);
        verify(itemService).findItemById(1);
    }
}