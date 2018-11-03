package family;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Wife {


//    public List<String> getListFromWifeForPurchase() {
//        return listFromWifeForPurchase;
//    }

         String[] getNamesListFromWife() {
        return itemNamesListFromWife;
    }

    public   String[] itemNamesListFromWife = {"Sony","Bread", "Lenovo", "Onion", "Milk"};
    public List<String> listFromWifeForPurchase = new ArrayList<>();

    public List<String> createItemsListForPurchase(String[] names) {
         Collections.addAll(listFromWifeForPurchase, names);
            return listFromWifeForPurchase;
        }

        public List<String> addToListItems(String name){
listFromWifeForPurchase.add(name);
return listFromWifeForPurchase;
        }


    public static void main(String[] args) {
Wife w = new Wife();
        String[] listFromWife = {"Sony","Bread", "Lenovo", "Onion"};
        System.out.println(w.createItemsListForPurchase(listFromWife));

    }
}