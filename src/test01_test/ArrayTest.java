package test01_test;


import java.util.Locale;

public class ArrayTest {
    public static void main(String[] args) {
        String word = "Cool";
//        String[] myArray = word.toCharArray();
        word= word.replace('o', 'a').toUpperCase();

        System.out.println(word);
    }
}
