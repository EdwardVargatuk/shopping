package family;

import interfaces.ShopItems;
import shops.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Husband {
    private List<ShopItems> shopI = new ArrayList<>();

    //    public Husband(List<ShopItems> shopI){
//        this.shopI =shopI;
//    }
    public Husband() {
    }

    private List<Item> itemListFromAllShops = new ArrayList<>();
    private List<Item> itemListThatCanPurchase = new ArrayList<>();
    private List<String> namesListOfItemThatCanPurchase = new ArrayList<>();
    private List<String> namesListOfItemFromAllShops = new ArrayList<>();

    public void husbandAction(List<String> listFromWife) {
        if (itemListFromAllShops != null) {
            itemListFromAllShops.clear();
            getTotalListOfItemsInShops();
            createListOfNamesFromAllShops();
        }
        selectItemNamesAccordingWifeList(listFromWife);
        getItemByNameForPurchase();

    }
//    public void messageOfShop(){
//                    if (shopI instanceof TechShop)
//                System. out.println(((TechShop) shopI).message());
//
//    }

    public void addShop(ShopItems shopItems) {
        shopI.add(shopItems);
    }

    private void getTotalListOfItemsInShops() {
        for (ShopItems shopItem : shopI) {
            itemListFromAllShops.addAll(shopItem.getShopItemList());
        }
    }

    private void createListOfNamesFromAllShops() {
//        for (Item itemList : itemListFromAllShops) {
//            String itemNames = itemList.getName();
//            namesListOfItemFromAllShops.add(itemNames);
//        }
        namesListOfItemFromAllShops = itemListFromAllShops.stream()
                .map(Item::getName)
                .collect(Collectors.toList());
    }

    private void selectItemNamesAccordingWifeList(List<String> listFromWife) {
        createListOfNamesFromAllShops();
        namesListOfItemThatCanPurchase.clear();
        namesListOfItemFromAllShops.stream()
                .filter(listFromWife::contains)
                .forEach(x -> namesListOfItemThatCanPurchase.add(x));
    }

    private void getItemByNameForPurchase() {
        itemListThatCanPurchase.clear();
        for (Item itemFromAllList : itemListFromAllShops) {
            for (String str : namesListOfItemThatCanPurchase) {
                if (str.equals(itemFromAllList.getName())
                ) {
                    itemListThatCanPurchase.add(itemFromAllList);
                }
            }
        }
    }

    public double getTotalPriceOfItems() {
        double result = 0;
        for (Item itemToBuy : itemListThatCanPurchase) {
            result += itemToBuy.getPrice();
        }
        return result;
    }

    public List<Item> getItemListFromAllShops() {
        return itemListFromAllShops;
    }

    public List<Item> getItemListThatCanPurchase() {
        return itemListThatCanPurchase;
    }

}