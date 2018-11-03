package family;

import shops.Grocery;
import shops.Item;
import shops.TechShop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Husband extends Wife{

    private List<Item> itemListFromAllShops = new ArrayList<>();
    private List<String> namesListOfItemThatAreInStores = new ArrayList<>();
    private List<String> namesListOfItemFromAllShops = new ArrayList<>();


    private List<Item> getTotalListOfItemsInShops(List<Item>... requiredShop) {
        for (List<Item> items : requiredShop) {
            itemListFromAllShops.addAll(items);
        }
        return itemListFromAllShops;
    }

    private List<String> createListOfNamesFromAllShops() {
//        for (Item itemList : itemListFromAllShops) {
//            String itemNames = itemList.getName();
//            namesListOfItemFromAllShops.add(itemNames);
//        }

         namesListOfItemFromAllShops = itemListFromAllShops.stream().map(Item::getName).collect(Collectors.toList());


        return namesListOfItemFromAllShops;
    }


    private void selectItemNamesAccordingWifeList() {
//        Wife w = new Wife();
//        String[] s = w.getNamesListFromWife();
        List<String> listFromWife = createItemsListForPurchase(getNamesListFromWife());
        System.out.println(listFromWife);
        createListOfNamesFromAllShops();
//        List<String> sss = w.createItemsListForPurchase(s);
//        List<String> hhh = createListOfNamesFromAllShops();
//        List<String> namesListOfItemThatAreInStores = new ArrayList<>();
        namesListOfItemFromAllShops.stream().filter(x -> listFromWife.contains(x)).forEach(x -> namesListOfItemThatAreInStores.add(x));
//        if (sss.get(0).contains(hhh.get(1))) System.out.println("1");
        System.out.println(namesListOfItemThatAreInStores);




//        List<Item> field1Listttt = itemListFromAllShops.stream().filter().anyMatch(namesListOfItemThatAreInStores.contains(itemListFromAllShops)).collect(Collectors.toList());
    }

    private List<Item> getStudentByName(List<Item> itemsAllList, List<String> nameItemsList) {

        List<Item> result = new ArrayList<>();
        for (Item itemfromAllList : itemsAllList) {
            for (String str : nameItemsList) {
                if (str.equals(itemfromAllList.getName())) {

//                    System.out.println(itemfromAllList);
                    result.add(itemfromAllList);
                }

            }
        }
        return result;
    }

    public double getTotalPrice(List<Item> ii) {
        double resu = 0;
        for (Item itemPr : ii) {

            resu += itemPr.getPrice();
        }

        return resu;
    }


//    public List<Item> getFromShop (){
//        List<Item> jhj = getTotalListOfItemsInShops();
//        List<Item> lis = new ArrayList<Item>();
//        jhj.get(0).getName().stream().filter(d -> namesListOfItemThatAreInStores.contains(d)).forEach(d -> lis.add(d));
//        return lis;
//    }


    public static void main(String[] args) {
        Husband f = new Husband();
        Wife w = new Wife();
//        String[] listFromWife = {"Sony", "Bread", "Lenovo", "Onion"};
        Grocery gross = new Grocery();
        TechShop techShop = new TechShop();


        System.out.println(f.getTotalListOfItemsInShops(techShop.getTechShopItemsList(), gross.getGroceryItemsList()));
//        System.out.println(f.itemListFromAllShops);
//        System.out.println(f.createListOfNamesFromAllShops(listFromWife));

        System.out.println(w.addToListItems("Lemon"));

        f.selectItemNamesAccordingWifeList();
//        System.out.println(f.getFromShop());
//        System.out.println(f.createListOfNamesFromAllShops());
        System.out.println(f.itemListFromAllShops + "" + f.namesListOfItemThatAreInStores);
       List<Item> d =new ArrayList<>();
       d= f.getStudentByName(f.itemListFromAllShops, f.namesListOfItemThatAreInStores);
        System.out.println(d);
        System.out.println(f.getTotalPrice(d));
    }
}