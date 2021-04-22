package OfficeHours.Pracrice_04_05_2021;

public class Palindrom {
    public static void main(String[] args) {
        String word = "anna";
        boolean isPalindrom = true;

        for (int i=0; i< word.length()/2; i++) {
            if (word.charAt(i) != word.charAt(word.length()-1-i)) {
                isPalindrom = false;
                break;
            }
        }
        System.out.println(isPalindrom);
    }
}
