package be.cegeka.orders.order.services;

import be.cegeka.orders.order.domain.items.Item;
import be.cegeka.orders.order.domain.items.ItemRepository;
import be.cegeka.orders.order.services.ItemService;
import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.Arrays;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by kevinbi on 27/02/2017.
 */
public class ItemServiceTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private ItemService itemService;
    @Mock
    private ItemRepository itemRepository;
    @Test
    public void getAllItems() throws  Exception{
        Item item1 = new Item("Smurfen","Kleine standbeeldjes", 4.50);
        Item item2 = new Item("Daltons","Kleine criminelen",5.50);

        when(itemRepository.getAllItems()).thenReturn(Arrays.asList(item1,item2));
        Assertions.assertThat(itemService.getAllItems()).containsOnly(item1,item2);
    }

    @Test
    public void addNewItem_callsRepoWithNewItem(){
        itemService.addItem("beer", "six pack jupiler", 6.95);

        verify(itemRepository).addItem(new Item("beer", "six pack jupiler", 6.95));
    }


}