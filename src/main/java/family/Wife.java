package family;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Wife  {


    public List<String> getWantedGoodsFromWife() {
        return wantedGoodsFromWife;
    }

    private List<String> wantedGoodsFromWife = new ArrayList<>();

    public void createAndAddItemsToListForPurchase(String[] names) {
        Collections.addAll(wantedGoodsFromWife, names);
    }
}