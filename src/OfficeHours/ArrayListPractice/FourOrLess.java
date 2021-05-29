package OfficeHours.ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;


public class FourOrLess {
    public static void main(String[] args) {

        ArrayList<String> myAList = new ArrayList<>(Arrays.asList("apples", "tree", "loop", "cat", "animal", "shortcut"));

        ArrayList<String> fourOrLess = new ArrayList<>();


            fourOrLess.add(myAList.get(1));
            fourOrLess.add(myAList.get(2));
            fourOrLess.add(myAList.get(3));



        System.out.println(fourOrLess);
    }
}
