package shops;

import interfaces.ShopFactory;

import java.util.ArrayList;
import java.util.List;

public class TechShop extends Shop implements ShopFactory {


    private List<Item> techShopItemsList;









    public static String[] names = {"Apple", "Sony", "Samsung", "Sharp", "Acer"};
    public static double[] prices = {100.0, 150.0, 80.5, 70, 40};

    public TechShop() {
        this.techShopItemsList = new ArrayList<Item>(createItemsList(names, prices));
    }

    public List<Item> getTechShopItemsList() {
        return techShopItemsList;
        }
        public  void message(){
            System.out.println("Thanks for taking advantage of our services ");
        }
}

//public List<Item> create(){
//    techShopItemsList = new TechShop().createItemsList(names,prices);
//    return techShopItemsList;
//}







