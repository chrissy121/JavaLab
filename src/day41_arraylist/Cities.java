package day41_arraylist;

import java.util.ArrayList;

public class Cities {
    public static void main(String[] args) {
        //declare arrayList  alt/option+enter

        ArrayList<String> cities= new ArrayList<>();
        //add cities to arraylist -->add methods

        cities.add("Washington DC"); //0
        cities.add("New York");      //1
        cities.add("Vienna");
        cities.add("Adana");
        cities.add("LA");           //4

        //add Ashgabat

        cities.add(0, "Ashgabat");

        //print all values in same line
        System.out.println(cities);

        //first and last city
        System.out.println("first city = " + cities.get(0));
        System.out.println("last city = " + cities.get(cities.size()-1));

        //print count of items in arraylist
        System.out.println("count of items = " + cities.size());
        System.out.println(cities);

        //for loop and print ass values in same line
        for (int i = 0; i < cities.size()-1 ; i++) {
            System.out.print(cities.get(i)+" ");
        }
        System.out.println();

        for (String city : cities) {
            System.out.print(city + " ");
        }
        System.out.println();
        //delete item from arraylist
        cities.remove(3);
        System.out.println(cities);

        //remove using object
        cities.remove("New York");
        System.out.println("after remove = " + cities);

        //delete or remove all values from list

        cities.clear();
        System.out.println("cities = " + cities);

        //using isEmpty()

        if(cities.isEmpty()) {
            System.out.println("list is empty");
        }

        //check size() == 0
        if(cities.size() == 0) {
            System.out.println("list is Empty");
        }

    }
}
