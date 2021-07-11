package OfficeHours.Mine.JavaIQ;

public class Unique_Character {
    public static void main(String[] args) {
        String word = "AAABBBCCCDEF";
        System.out.println(fineUnique(word));
    }

public static String fineUnique(String str) {
    String result = "";

    for (int i = 0; i < str.length(); i++) {
        int count = 0;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(i) == str.charAt(j)) {
                count++;
            }
        }
        if (count == 1) {
            result += str.charAt(i);
        }
    }
    return result;
  }
}

