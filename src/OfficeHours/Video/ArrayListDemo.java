package OfficeHours.Video;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> lst = new ArrayList<>();
        List<String> lst1= new ArrayList<>();

        // add element

        lst.add("Apple"); lst.add("Orange"); lst.add("Banana");
        System.out.println(lst);

        //getting element

        System.out.println("first element = " + lst.get(0));
        System.out.println("second element = " + lst.get(1));

        //check item
        System.out.println(lst.contains("Apple"));
        System.out.println(lst.contains("Pear"));

        //indexOf
        System.out.println(lst.indexOf("Apple"));
        System.out.println(lst.indexOf("Pear"));

        //size
        System.out.println("size = " + lst.size());

        //check empty?
        System.out.println(lst.isEmpty());

        //setting the value for certain index
        lst.set(1, "Watermelon");
        System.out.println("new list item" + lst);

        //remove
        lst.remove(0);
        System.out.println("after removing = " + lst);

        //remove
        lst.remove("Banana");
        System.out.println("second removing" + lst);

        //remove all items
        lst.clear();
        System.out.println("after clearing" + lst);

        //checking if the list is empty or not
        System.out.println(lst.isEmpty());
    }
}
