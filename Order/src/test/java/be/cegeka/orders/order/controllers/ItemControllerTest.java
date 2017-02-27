package be.cegeka.orders.order.controllers;

import be.cegeka.orders.order.services.ItemService;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import javax.persistence.Table;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

/**
 * Created by kevinbi on 27/02/2017.
 */
public class ItemControllerTest {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private ItemController itemController;

    @Mock
    private ItemService itemService;

    @Test
    public void itemControllerAddItem_CallsItemServiceAddItem(){

        String name = "beer";
        String description = "Six pack Jupiler";
        double price = 6.95;
        itemController.addItem(name, description, price);

        verify(itemService).addItem(name, description, price);
    }

    @Test
    public void itemControllerGetAllItems_CallsServiceGetAllItems(){
        itemController.getItems();

        verify(itemService).getAllItems();
    }

}