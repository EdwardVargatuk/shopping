package family;

import interfaces.Shop;

import java.util.*;

public class Wife {

   private Husband husband = new Husband();
    private Set<String> wantedGoodsFromWife = new LinkedHashSet<>();

    private Set<String> getWantedGoodsFromWife() {
        return wantedGoodsFromWife;
    }

    public void createAndAddItemsToListForPurchase(String[] names) {
        Collections.addAll(wantedGoodsFromWife, names);
        System.out.println("Wife add to list:" + Arrays.toString(names));
    }

    public void sendToHusbandShopList(Shop shop) {
        husband.addShopToList(shop);
    }

    public void wifeAction() {
        husband.getItemsListFromWife(getWantedGoodsFromWife());
        husband.getTotalListOfItemsInShops();
        husband.getItemForPurchase();
        System.out.println("List of necessary items from Wife:\n" + getWantedGoodsFromWife());
        System.out.println("Total list:\n" + husband.getItemListFromAllShops());
        System.out.println("Bought:\n" + husband.getItemListThatCanPurchase());
        System.out.println("Total price = " + husband.getTotalPriceOfItems());

    }
}