package day33_Array;

import java.util.Arrays;

public class SplitReview {
    public static void main(String[] args) {



        String word1 = "java";
        String[] array = word1.split("a");
        System.out.println(array.length);
        int countOfA = array.length;
        System.out.println("CountOfA = " + countOfA);

        countOfA = array.length - 1;
        if (word1.endsWith("a")) {
            countOfA ++;
        }
        System.out.println("countOfA = " + countOfA);
        System.out.println("----split with empty string----");
        String word2 = "java1sql2html";
        String[] strArr2 = word2.split("\\d") ;
        System.out.println(Arrays.toString(strArr2));

        word2 = word2.replaceAll("\\d", "_");
        System.out.println("word2= " + word2);

        String password = "bcTd123_5";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }

    }
}
