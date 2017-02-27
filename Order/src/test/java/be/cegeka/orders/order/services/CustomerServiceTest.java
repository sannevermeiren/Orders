package be.cegeka.orders.order.services;

import be.cegeka.orders.order.controllers.CustomerController;
import be.cegeka.orders.order.domain.customers.Customer;
import be.cegeka.orders.order.domain.customers.CustomerRepository;
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
public class CustomerServiceTest {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private CustomerService customerService;

    @Mock
    private CustomerRepository customerRepository;

    @Test
    public void serviceAddCustomer() throws Exception {
        String name = "Wouter";
        String lastname = "Bauweraerts";
        String email = "WouterB@Cegeka.com";
        String street = "Dorpstraat";
        String housenumber = "101";
        int postalcode = 3000;
        String city = "Leuven";
        String phonenumber = "0477468200";

        customerService.addCustomer(name, lastname, email, street, housenumber, postalcode, city, phonenumber);
        verify(customerRepository).addCustomer(new Customer(name, lastname, email, street, housenumber, postalcode, city, phonenumber));
    }



}