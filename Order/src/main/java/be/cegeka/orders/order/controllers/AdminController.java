package be.cegeka.orders.order.controllers;

import be.cegeka.orders.order.domain.customers.Customer;
import be.cegeka.orders.order.services.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by sannev on 27/02/2017.
 */

@Controller
@RequestMapping("/Admin")
public class AdminController {

    @Inject
    private CustomerService customerService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }
}
