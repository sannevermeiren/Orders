package be.cegeka.orders.order.controllers;

import be.cegeka.orders.order.domain.order.Order;
import be.cegeka.orders.order.services.OrderService;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import javax.inject.Inject;


import static org.mockito.Mockito.verify;

public class OrderControllerTest {
    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();
    @InjectMocks
    private OrderController orderController;
    @Mock
    private OrderService orderService;
    @Test
    public void orderControllerPlaceOrder_CallsOrderServicePlaceOrder(){
        Order order = new Order();
        orderController.placeOrder(order);
        verify(orderService).insertNewOrder(order);
    }

}
