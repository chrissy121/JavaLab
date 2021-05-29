package OfficeHours.ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetWord {
    public static void main(String[] args) {

        ArrayList<String> myArrList = new ArrayList<>(Arrays.asList("java", "html", "java", "css", "java", "javascript", "selenium"));
        String word = "java";
        int count = 0;

       for (String each: myArrList){
           if(each.equals("java")) {
               count++;
           }

       }
        System.out.println("Count = " + count);

    }
}
