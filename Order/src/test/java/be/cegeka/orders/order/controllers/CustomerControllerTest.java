package be.cegeka.orders.order.controllers;

import be.cegeka.orders.order.domain.customers.Customer;
import be.cegeka.orders.order.services.CustomerService;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

/**
 * Created by sannev on 27/02/2017.
 */
public class CustomerControllerTest {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private CustomerController customerController;

    @Mock
    private CustomerService customerService;

    @Test
    public void ccontrollerAddCustomer() throws Exception {
        String name = "Wouter";
        String lastname = "Bauweraerts";
        String email = "WouterB@Cegeka.com";
        String street = "Dorpstraat";
        String housenumber = "101";
        int postalcode = 3000;
        String city = "Leuven";
        String phonenumber = "0477468200";

        customerController.addCustomer(name, lastname, email, street, housenumber, postalcode, city, phonenumber);
        verify(customerService).addCustomer(name, lastname, email, street, housenumber, postalcode, city, phonenumber);
    }

}