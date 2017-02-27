package be.cegeka.orders.order.controllers;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import javax.inject.Inject;
import javax.persistence.criteria.Order;

import static org.mockito.Mockito.verify;

/**
 * Created by kevinbi on 27/02/2017.
 */
public class OrderControllerTest {
    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();
    @InjectMocks
    private OrderController orderController;
    @Inject
    private OrderService orderService;
    @Test
    public void orderControllerPlaceOrder_CallsOrderServicePlaceOrder(){
        orderController.placeOrder(new Order);
        verify(orderService).insertNewOrder();
    }

}
