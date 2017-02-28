package be.cegeka.orders.order.controllers;

import be.cegeka.orders.order.domain.order.Order;
import be.cegeka.orders.order.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;



@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    public void placeOrder(Order order) {
        orderService.insertNewOrder(order);
    }
}
