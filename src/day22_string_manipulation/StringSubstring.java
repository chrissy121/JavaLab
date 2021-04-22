package day22_string_manipulation;

public class StringSubstring {
    public static void main(String[] args) {
        String word = "Hello my family";
        System.out.println(word.substring(0,5));
        System.out.println(word.substring(0, 8));
        System.out.println(word.substring(6, 8));
        System.out.println(word.substring(9, 15));

        System.out.println(word.substring(6));
    }
}
