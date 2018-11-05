package shops;

import java.util.ArrayList;
import java.util.List;

public class Jewelry extends Shop {

    private List<Item> jewelryItemsList;
    private String[] names = {"Ring", "Necklaces", "Bracer"};
    private double[] prices = {999,9, 4999,9, 3000};

    public Jewelry() {
        this.jewelryItemsList = new ArrayList<Item>(createItemsList(names, prices));
    }

    public List<Item> getJewelryItemsList() {
        return jewelryItemsList;
    }

}
