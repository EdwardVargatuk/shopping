package shops;

import interfaces.ShopItems;

import java.util.List;

public class Jewelry extends Shop implements ShopItems {

    private List<Item> jewelryItemsList;

    public Jewelry(List<Item> jewelryItemsList) {
        this.jewelryItemsList = jewelryItemsList;
    }

    @Override
    public List<Item> getShopItemList() {
        return jewelryItemsList;
    }
}
