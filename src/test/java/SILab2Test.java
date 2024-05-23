


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    private List<Item> create(Item... items){
        return new ArrayList<Item>(Arrays.asList(items));
    }

    @Test
    void checkEveryBranch() {
        RuntimeException ex;
        ex=assertThrows(RuntimeException.class, ()-> SILab2.checkCart(null,0));
        assertTrue(ex.getMessage().contains("allItems list can't be null!"));

        assertTrue(SILab2.checkCart(new ArrayList<Item>(), 0));

        assertFalse(SILab2.checkCart(new ArrayList<Item>(), -4));

        ex=assertThrows(RuntimeException.class, ()-> SILab2.checkCart(create(new Item("",null,20,0.4f)),0));
        assertTrue(ex.getMessage().contains("No barcode!"));

        assertFalse(SILab2.checkCart(create(new Item("","256487",340,0.4f)),0));

        ex=assertThrows(RuntimeException.class, ()-> SILab2.checkCart(create(new Item("","256g",340,0.4f)),0));
        assertTrue(ex.getMessage().contains("Invalid character in item barcode!"));

        assertFalse(SILab2.checkCart(create(new Item("asass","25677",210,-0.4f)),0));

    }

    @Test
    void checkMultipleCondition() {

        assertTrue(SILab2.checkCart(create(new Item("asass","0432",500,0.4f)),10000));

        assertFalse(SILab2.checkCart(create(new Item("asass","1432",500,0.4f)),2));

        assertFalse(SILab2.checkCart(create(new Item("asass","0432",500,-1f)),2));

        assertFalse(SILab2.checkCart(create(new Item("asass","0432",100,0.4f)),2));

    }
}
