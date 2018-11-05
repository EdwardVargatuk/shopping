package family;

import interfaces.ShopFactory;
import shops.Item;
import shops.TechShop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Husband extends ArrayList<ShopFactory>{


    private List<Item> itemListFromAllShops = new ArrayList<>();
    private List<Item> itemListThatCanPurchase = new ArrayList<>();
    private List<String> namesListOfItemThatCanPurchase = new ArrayList<>();
    private List<String> namesListOfItemFromAllShops = new ArrayList<>();




    public List<Item> getTotalListOfItemsInShops(List<Item>... requiredShop) {
        for (List<Item> items : requiredShop) {
            itemListFromAllShops.addAll(items);
        }
        return itemListFromAllShops;
    }

    public void createListOfNamesFromAllShops() {
//        for (Item itemList : itemListFromAllShops) {
//            String itemNames = itemList.getName();
//            namesListOfItemFromAllShops.add(itemNames);
//        }
        namesListOfItemFromAllShops = itemListFromAllShops.stream()
                .map(Item::getName)
                .collect(Collectors.toList());
    }


    public void selectItemNamesAccordingWifeList(List<String> listFromWife) {
        createListOfNamesFromAllShops();
        namesListOfItemThatCanPurchase.clear();
        namesListOfItemFromAllShops.stream()
                .filter(listFromWife::contains)
                .forEach(x -> namesListOfItemThatCanPurchase.add(x));
    }

    public List<Item> getItemByNameForPurchase() {
        for (Item itemFromAllList : itemListFromAllShops) {
            for (String str : namesListOfItemThatCanPurchase) {
                if (str.equals(itemFromAllList.getName())) {
                    itemListThatCanPurchase.add(itemFromAllList);
                }
            }
        }
        return itemListThatCanPurchase;
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


//    public void addShop(ShopFactory shopFactory){
//        add(shopFactory);
//    }
//    public List<Item> generatingProgram(){
//        List<Item> ite =new ArrayList<>();
//        for (ShopFactory shopFactory : this) {
//            ite=(shopFactory.createItemsList(TechShop.names, TechShop.prices));
//        }
//        return ite;}
//
//    public static void main(String[] args) {
//        Husband h = new Husband();
//
//h.addShop(new TechShop());
//        System.out.println(h.generatingProgram());
//    }
}