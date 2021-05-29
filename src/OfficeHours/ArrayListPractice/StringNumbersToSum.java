package OfficeHours.ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class StringNumbersToSum {
    public static void main(String[] args) {
        ArrayList<String> myArrList = new ArrayList<>(Arrays.asList("123", "34", "513"));
        ArrayList<Integer> myNewList = new ArrayList<>();

        for (String each : myArrList) {
            myNewList.add(Хувиргах(each));
        }
        System.out.println(myNewList);

        String str = "Bolormaa";
        str = str.replaceAll("o", "k");
        System.out.println(str);
    }

    public static int Хувиргах(String str){
        int num =0;
        for (int i=0; i<str.length(); i++) {
            num += Integer.parseInt(""+str.charAt(i));
        }
       return num;
    }
}
