package shops;

import interfaces.ShopItems;

import java.util.List;

public class TechShop extends Shop implements ShopItems {

    private List<Item> techShopItemsList;

    public TechShop(List<Item> techShopItemsList) {
        this.techShopItemsList = techShopItemsList;
    }

    @Override
    public List<Item> getShopItemList() {
        return techShopItemsList;
    }

    public String message() {
        return "Thanks for taking advantage of our services ";
    }

}







