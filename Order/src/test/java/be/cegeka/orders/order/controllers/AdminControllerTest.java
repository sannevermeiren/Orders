package be.cegeka.orders.order.controllers;

import be.cegeka.orders.order.services.CustomerService;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.verify;

/**
 * Created by sannev on 27/02/2017.
 */
public class AdminControllerTest {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private AdminController adminController;

    @Mock
    private CustomerService customerService;

    @Test
    public void adminGetAllCustomers_callsAdminServiceGetAllCustomers(){
        adminController.getAllCustomers();

        verify(customerService).getAllCustomers();
    }

}