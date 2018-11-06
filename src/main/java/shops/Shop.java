package shops;

import java.util.*;

public class Shop {


    public Shop() {
    }

    public List<Item> createItemsList(String[] namesOfItems, double[] pricesOfItems) {
        if (namesOfItems != null) {
            Item item;
            List<Item> shopItemList = new ArrayList<>();
            for (int i = 0, j = 0; (i < namesOfItems.length); i++, j++) {
                item = new Item(namesOfItems[i], pricesOfItems[j]);
                shopItemList.add(item);
            }
            return shopItemList;
        } else return null;
    }
}