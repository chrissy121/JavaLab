package OfficeHours.Practice_05_11_2021;

import java.util.ArrayList;

public class SepareterChallenge {
    public static void main(String[] args) {
    ArrayList<Character> all = new ArrayList<>();
        String str = " ABCD123$%#@&456EFG!";

        for (int i = 0; i < str.length(); i++) {
            all.add(str.charAt(i));

        }

        ArrayList<Character> letters = new ArrayList<>(all);
        ArrayList<Character> digits = new ArrayList<>(all);
        ArrayList<Character> special = new ArrayList<>(all);

        letters.removeIf(eachChar -> !Character.isLetter(eachChar));
        digits.removeIf(eachChar -> !Character.isDigit(eachChar));
        special.removeIf(eachChar -> !Character.isDigit(eachChar) || Character.isLetter(eachChar));

        System.out.println("letters : " + letters);
        System.out.println("digits: " + digits);
        System.out.println("special : " + special);

    }
}
