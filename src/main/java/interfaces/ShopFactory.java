package interfaces;

import shops.Item;

import java.util.List;

public interface ShopFactory {

    List<Item> createItemsList(String[] names, double[] prices);
}
