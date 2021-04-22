package OfficeHours.Mine.LoopsPractice2;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
       /*
       [IQ] PalindromeA word that is the same read forwards and backwards.
       User takes a word from the console. Print true if the word is a palindrome.
       Print false if the word is not palindrome.-> input: civic-> output: true
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word:");
        String word = input.next();
        int starting = 0 ;
        int ending = word.length();
        int s = 0;

        for (int i= starting; i<= word.length()/2; i++ ) {
            if (word.charAt(i) != word.charAt(ending-1-i)) {
                  s = 1;
                  break;
                 }
            }
        if (s == 0) {
            System.out.println(word + " is palindrom");
        } else {
            System.out.println(word + " is not palindrom");
        }
    }
}
