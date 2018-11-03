package shops;

import java.util.ArrayList;
import java.util.List;

public class TechShop extends Shop {


    private List<Item> techShopItemsList;
    private String[] names = {"Apple", "Sony", "Samsung", "Sharp", "Acer"};
    private double[] prices = {100.0, 150.0, 80.5, 70, 40};

    public TechShop() {
        this.techShopItemsList = new ArrayList<Item>(createItemsList(names, prices));
    }

    public List<Item> getTechShopItemsList() {
        return techShopItemsList;
    }
}

//public List<Item> create(){
//    techShopItemsList = new TechShop().createItemsList(names,prices);
//    return techShopItemsList;
//}







