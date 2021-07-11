package OfficeHours.Mine.JavaIQ;

import day55_abstraction.exercise.Lifting;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String word = "AABBCCCDEFG";
        System.out.println(removeDuplicate(word));

    }

    public static String removeDuplicate(String word) {
        String result="";

        for (int i = 0; i < word.length(); i++) {
            if(!(result.contains(word.charAt(i)+""))) {
                result+=word.charAt(i);
            }
        }
        return result;
    }

}
