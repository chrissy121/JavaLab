package OfficeHours.Mine;

public class CountUpperLowerNumber {
    public static void main(String[] args) {
        String word = "2juMp41EEkd4s4";
        int upperCase = 0;
        int lowerCase = 0;
        int number =0;

        for (int i=0; i <= word.length()-1; i++) {
            if (word.charAt(i) >= 65 && word.charAt(i)<= 90) {
                upperCase ++;
            }
            if (word.charAt(i) >= 97 && word.charAt(i)<= 122 ) {
                    lowerCase ++;
            }

            if (word.charAt(i) >= '0' && word.charAt(i)<= '9') {
                number ++;
            }
        }
        System.out.println(upperCase + " uppercase letters");
        System.out.println(lowerCase + " lowercase letters");
        System.out.println(number + " numbers");
    }
}
