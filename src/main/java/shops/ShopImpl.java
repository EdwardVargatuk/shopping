package shops;

import interfaces.Shop;

import java.util.*;

public class ShopImpl implements Shop {

    private List<Item> items = new LinkedList<>();

    public List<Item> getShopItemList() {
        return items;
    }

    public void addProducts(String[] namesOfItems, double[] pricesOfItems) {
        if (namesOfItems != null) {
            Item item;
            for (int i = 0, j = 0; (i < namesOfItems.length); i++, j++) {
                item = new Item(namesOfItems[i], pricesOfItems[j]);
                items.add(item);
            }

        }
    }
}