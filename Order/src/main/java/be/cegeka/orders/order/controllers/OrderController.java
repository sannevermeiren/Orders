package be.cegeka.orders.order.controllers;

import be.cegeka.orders.order.domain.order.Order;
import be.cegeka.orders.order.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;



@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    public void placeOrder(int customer_id, int item_id, int quantity) {
        orderService.insertNewOrder(customer_id, item_id, quantity);
    }
}
