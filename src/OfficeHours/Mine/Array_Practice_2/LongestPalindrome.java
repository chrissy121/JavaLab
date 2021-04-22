package OfficeHours.Mine.Array_Practice_2;

public class LongestPalindrome {
    public static void main(String[] args) {
        String[] myArray = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        String result = "";
        int maxLeng = 0;

        for (int i = 0; i < myArray.length; i++) {

            if (isPalindrome(myArray[i])) {

                if (myArray[i].length() >= maxLeng) {
                    maxLeng = myArray[i].length();
                    result = myArray[i];
                }
            }
        }
        System.out.println("Longest Palindrome word is " + result);

    }

    public static boolean isPalindrome(String word) {

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
