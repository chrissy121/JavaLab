package OfficeHours.ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class CountLetters {
    public static void main(String[] args) {
        ArrayList<String> myArrList = new ArrayList<>(Arrays.asList("java", "html", "css", "java", "javascript", "selenium"));

        String sentence = String.join("", myArrList);
        int count = sentence.split("a").length-1;

        System.out.println("count: " + count);
    }
}
