package OfficeHours.Constructor;

import java.util.ArrayList;
import java.util.List;

public class WalmartStore {
    String location;
    double totalWorth;
    List<String> inventory = new ArrayList<>();
    static String companyName;



    public WalmartStore() {
        this.location = location;
        this.inventory = inventory;
    }

    public WalmartStore(String location, List inventory) {
        this.location = location;
        this.inventory = inventory;
    }

//    public calculateWorth(List inventory) {
//        return inventory;
//    }

}
