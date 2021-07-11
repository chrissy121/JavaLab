package OfficeHours.Mine.JavaIQ;

import java.util.Arrays;

public class ReverseSecondWord {
    public static void main(String[] args) {
        String word = "java is fun";
        System.out.println(reverseSe4condWord(word));
    }
    public static String reverseSe4condWord(String word) {
        String[] newArr = word.split(" ");

        String secondWord = newArr[1];
        String reverse = "";
        for (int i = secondWord.length()-1; i >=0 ; i--) {
            reverse+=secondWord.charAt(i);
        }

        return  newArr[0] + " " + reverse + " " + newArr[2];
    }

}
