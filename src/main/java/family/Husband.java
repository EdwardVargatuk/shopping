package family;

import interfaces.Shop;
import shops.*;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Husband {

    private List<Shop> shopList = new ArrayList<>();
    private Set<Item> itemListFromAllShops = new LinkedHashSet<>();
    private Set<Item> itemListThatCanPurchase = new LinkedHashSet<>();
    private Set<String> itemListFromWife = new LinkedHashSet<>();

    public Husband() {
    }

    public Set<String> getItemListFromWife() {
        return itemListFromWife;
    }

    public Set<Item> getItemListFromAllShops() {
        return itemListFromAllShops;
    }

    public Set<Item> getItemListThatCanPurchase() {
        return itemListThatCanPurchase;
    }

    void addShopToList(Shop shop) {
        shopList.add(shop);
    }

    void getTotalListOfItemsInShops() {
        for (Shop shopItem : shopList) {
            itemListFromAllShops.addAll(shopItem.getShopItemList());
        }
    }

    void getItemsListFromWife(Set<String> listFromWife) {
        itemListFromWife.addAll(listFromWife);
    }

    void getItemForPurchase() {
        itemListThatCanPurchase.clear();
        for (Item itemFromAllList : itemListFromAllShops) {
            for (String str : itemListFromWife) {
                if (str.equals(itemFromAllList.getName())
                ) {
                    itemListThatCanPurchase.add(itemFromAllList);
                }
            }
        }
    }

    double getTotalPriceOfItems() {
        double result = 0;
        for (Item itemToBuy : itemListThatCanPurchase) {
            result += itemToBuy.getPrice();
        }
        return result;
    }

}