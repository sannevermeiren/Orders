package be.cegeka.orders.order.services;

import be.cegeka.orders.order.domain.customers.Customer;
import be.cegeka.orders.order.domain.customers.CustomerRepository;
import org.jvnet.hk2.annotations.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by sannev on 27/02/2017.
 */
@org.springframework.stereotype.Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Inject

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void addCustomer(String name, String lastname, String email, String street, String housenumber, int postalcode, String city, String phonenumber) {

        Customer customer = new Customer(name, lastname,email, street, housenumber,postalcode, city, phonenumber);
        customerRepository.addCustomer(customer);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.getAll();
    }


}
