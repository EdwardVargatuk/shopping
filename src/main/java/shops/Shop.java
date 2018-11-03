package shops;

import interfaces.ShopFactory;

import java.util.*;

public class Shop implements ShopFactory {

    public List<Item> createItemsList(String[] namesOfItems, double[] pricesOfItems) {
        if (namesOfItems != null) {
            List<Item> shopItemList;
            Item item;
            shopItemList = new ArrayList<Item>();
            for (int i = 0, j = 0; (i < namesOfItems.length); i++, j++) {
                item = new Item(namesOfItems[i], pricesOfItems[j]);
                shopItemList.add(item);
            }
            return shopItemList;
        } else return null;
    }
}