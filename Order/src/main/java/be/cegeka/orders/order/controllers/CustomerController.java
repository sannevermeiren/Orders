package be.cegeka.orders.order.controllers;

import be.cegeka.orders.order.services.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.inject.Inject;
import javax.lang.model.element.Name;
import javax.ws.rs.POST;

/**
 * Created by sannev on 27/02/2017.
 */
@Controller
@RequestMapping ("/CUSTOMER")
public class CustomerController {


    private final CustomerService customerService;

    @Inject
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addCustomer(@RequestParam (name = "NAME")String name,
                            @RequestParam(name = "LASTNAME")String lastname,
                            @RequestParam(name = "EMAIL")String email,
                            @RequestParam(name = "STREET") String street,
                            @RequestParam(name = "HOUSENUMBER") String housenumber,
                            @RequestParam(name = "POSTAL_CODE") int postalcode,
                            @RequestParam(name = "CITY") String city,
                            @RequestParam(name = "PHONENUMBER") String phonenumber) {

        customerService.addCustomer(name, lastname, email, street, housenumber, postalcode, city, phonenumber);
    }
}
