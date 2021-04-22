package day22_string_manipulation;

public class ReverseUsingCharAt {
    public static void main(String[] args) {
        String word = "Anna";
        System.out.print(word.charAt(3));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(0) );
        System.out.println(word);
        System.out.println("" + word.charAt(3) + word.charAt(2)+ word.charAt(1) + word.charAt(0));
        String reverse = "" + word.charAt(3) + word.charAt(2)+ word.charAt(1) + word.charAt(0);
        System.out.println("word = " + word);
        System.out.println("reverse = " + reverse);
        if (word.equalsIgnoreCase(reverse)) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Not Palindrom");
        }
    }
}
