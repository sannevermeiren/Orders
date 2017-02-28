package be.cegeka.orders.order.services;

import be.cegeka.orders.order.domain.items.Item;
import be.cegeka.orders.order.domain.items.ItemRepository;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by kevinbi on 27/02/2017.
 */
@Named
public class ItemService {
    @Inject
    private ItemRepository itemRepository;
    public Iterable<Item> getAllItems() {
        return itemRepository.getAllItems();
    }

    public void addItem(String name, String description, double price) {
        itemRepository.addItem(new Item(name, description, price));
    }

    public Item findItemById(int id) {
        return itemRepository.findItemById(id);
    }
}
