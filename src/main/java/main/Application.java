package main;

import family.Wife;
import shops.*;
import shops.TechShop;

public class Application {
    public static void main(String[] args) {

        Wife wife = new Wife();
        String[] listFromWife = {"Sony", "Bread", "Lenovo", "Onion"};
        String[] namesTechShop = {"Apple", "Sony", "Samsung", "Sharp", "Acer"};
        String[] namesGrocery = {"Bread", "Sausage", "Butter", "Milk", "Potato"};
        String[] namesJewelry = {"Ring", "Necklaces", "Bracer"};
        double[] pricesTechShop = {100.0, 150.0, 80.5, 70, 40};
        double[] pricesGrocery = {10.0, 50.0, 10.5, 20, 5};
        double[] pricesJewelry = {999.9, 4999.9, 1599.9};
        TechShop techShop = new TechShop();
        techShop.addProducts(namesTechShop, pricesTechShop);
        Grocery grocery = new Grocery();
        grocery.addProducts(namesGrocery, pricesGrocery);
        Jewelry jewelry = new Jewelry();
        jewelry.addProducts(namesJewelry, pricesJewelry);
        wife.sendToHusbandShopList(techShop);
        wife.sendToHusbandShopList(grocery);
        wife.sendToHusbandShopList(jewelry);

        wife.createAndAddItemsToListForPurchase(listFromWife);
        wife.wifeAction();

        wife.createAndAddItemsToListForPurchase(new String[]{"Acer", "Earring"});
        wife.wifeAction();

        wife.createAndAddItemsToListForPurchase(new String[]{"Necklaces"});
        wife.wifeAction();
    }
}
