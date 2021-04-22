package day21_string_manipulation;

public class palindrom {
    public static void main(String[] args) {
        String word = "mom";
        char first = word.charAt(0);
        char last = word.charAt(2);
        if (first == last) {
            System.out.println("first and last letters match");
        } else {
            System.out.println("first and last letters mismatch");
        }

        if (word.charAt(0) == word.charAt(2)) {
            System.out.println("Match");
        } else {
            System.out.println("Mismatch");
        }
        String friend = "aziza";
        char firstLetter = friend.charAt(0);
        int count = friend.length();
        char lastLetter = friend.charAt(count - 1 );
        // char lastLetter = friend.charAt(friend.length()-1);
        if (firstLetter == lastLetter ) {
            System.out.println(friend + "- first and last match");
        } else {
            System.out.println(friend + " - first and last mismatch");
        }
    }
}
