package OfficeHours.ArrayListPractice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SeparateParts {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();

        String str = "ABCD123$%#@&456EFG!";

        char[] strToCharArray = str.toCharArray();

        for(char each : strToCharArray ) {
//            if(each >='A' && each<='Z') {
//                list1.add(""+ each);
//            }
            if(Character.isLetter(each)) {
                list1.add(""+each);
            }
            if(Character.isDigit(each)) {
                list3.add(""+each);
            }
            if(!Character.isDigit(each) && !Character.isLetter(each)) {
                list2.add(""+each);
            }

        }
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
    }

}
