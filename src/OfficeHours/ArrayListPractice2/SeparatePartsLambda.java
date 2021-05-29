package OfficeHours.ArrayListPractice2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SeparatePartsLambda {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        List<Character> list3 = new ArrayList<>();

        String str = "ABCD123$%#@&456EFG!";

        str.chars().forEach(c-> {
            if (Character.isDigit(c)) {
                list1.add(c-'0');
            } else if (Character.isLetter(c)) {
                list2.add((char)c);
            } else {
                list3.add((char)c);
            }
        });

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
    }
}
