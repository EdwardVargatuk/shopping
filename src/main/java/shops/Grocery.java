package shops;

import java.util.ArrayList;
import java.util.List;

public class Grocery extends Shop {

    private List<Item> groceryItemsList;
    private String[] names = {"Bread", "Sausage", "Butter", "Milk", "Potato"};
    private double[] prices = {10.0, 50.0, 10.5, 20, 5};

    public Grocery() {
        this.groceryItemsList = new ArrayList<Item>(createItemsList(names, prices));
    }

    public List<Item> getGroceryItemsList() {
        return groceryItemsList;
    }

}


