package OfficeHours.Constructor;

public class WalmartTest {

    public static void main(String[] args) {
        WalmartStore storeOne = new WalmartStore("VA");
        System.out.println(storeOne);

        Item pen = new Item("pen", 1.4, 10);
        Item hat = new Item("hat", 3.5, 20);

        WalmartStore storeTwo = new WalmartStore("IL");
        System.out.println(storeTwo);
        System.out.println(WalmartStore.companyName);

    }
}
