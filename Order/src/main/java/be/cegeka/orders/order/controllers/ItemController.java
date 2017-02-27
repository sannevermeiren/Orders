package be.cegeka.orders.order.controllers;

import be.cegeka.orders.order.domain.items.Item;
import be.cegeka.orders.order.services.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;



/**
 * Created by kevinbi on 27/02/2017.
 */
@Controller
@RequestMapping("/item")

public class ItemController {
    @Inject
    private ItemService itemService;
    @ResponseBody
    @RequestMapping(method = GET)
    public Iterable<Item> getItems(){
        return itemService.getAllItems();}

        @RequestMapping(method = POST)
    public void addItem(@RequestParam(name = "name") String name,
                        @RequestParam(name = "description") String description,
                        @RequestParam(name = "price") double price) {
        itemService.addItem(name, description, price);
    }
}
