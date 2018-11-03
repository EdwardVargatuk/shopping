package family;

import shops.Grocery;
import shops.Item;
import shops.TechShop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Wife  {


    public List<String> getListFromWifeWantPurchase() {
        return listFromWifeWantPurchase;
    }

    public List<String> listFromWifeWantPurchase = new ArrayList<>();

    public List<String> createItemsListForPurchase(String[] names) {
        Collections.addAll(listFromWifeWantPurchase, names);
        return listFromWifeWantPurchase;
    }

    public List<String> addToListItems(String name) {
        listFromWifeWantPurchase.add(name);
        return listFromWifeWantPurchase;
    }


    public static void main(String[] args) {
        Husband husband = new Husband();
        Wife wife = new Wife();
        String[] listFromWife = {"Sony", "Bread", "Lenovo", "Onion"};
        Grocery grocery = new Grocery();
        TechShop techShop = new TechShop();
        wife.createItemsListForPurchase(listFromWife);
        husband.getTotalListOfItemsInShops(techShop.getTechShopItemsList(), grocery.getGroceryItemsList());
        husband.createListOfNamesFromAllShops();
        List<String> listFromWifeWantPurchase = wife.getListFromWifeWantPurchase();
        husband.selectItemNamesAccordingWifeList(listFromWifeWantPurchase);
        System.out.println("List of necessary items from Wife:\n" + listFromWifeWantPurchase);
        System.out.println("Total list:\n" + husband.getItemListFromAllShops());
        wife.addToListItems("Acer");
        System.out.println("Wife add to list Acer, and list go on:\n"+listFromWifeWantPurchase);
        husband.selectItemNamesAccordingWifeList(wife.getListFromWifeWantPurchase());
        husband.getItemByNameForPurchase();
        System.out.println("Bought:\n" + husband.getItemListThatCanPurchase());
        System.out.println("Total price = "+husband.getTotalPriceOfItems());

    }
}