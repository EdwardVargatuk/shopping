package shops;

import interfaces.ShopItems;

import java.util.List;

public class Grocery extends Shop implements ShopItems {

    private List<Item> groceryItemsList;

    public Grocery(List<Item> groceryItemList) {
        this.groceryItemsList = groceryItemList;
    }

    @Override
    public List<Item> getShopItemList() {
        return groceryItemsList;
    }

    public String messagefromGrocery() {
        return "Thanks for you ";
    }
}


