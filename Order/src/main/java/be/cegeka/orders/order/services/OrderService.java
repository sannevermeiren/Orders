package be.cegeka.orders.order.services;

import be.cegeka.orders.order.domain.customers.Customer;
import be.cegeka.orders.order.domain.items.Item;
import be.cegeka.orders.order.domain.order.Order;
import be.cegeka.orders.order.domain.order.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private ItemService itemService;

    public void insertNewOrder(int customer_id, int item_id, int quantity) {
        Customer customer = customerService.findCustomerById(customer_id);
        Item item = itemService.findItemById(item_id);
        Order order = new Order();
        order.setCustomer(customer);
        order.setOrderItem(new OrderItem(order, item, quantity));
    }
}
