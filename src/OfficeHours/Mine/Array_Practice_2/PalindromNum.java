package OfficeHours.Mine.Array_Practice_2;

public class PalindromNum {
        public static void main(String[] args) {
            isPalindrome(1001);
        }

    public static void isPalindrome(int num){

        String str = ""+ num;
        boolean result = true;
        for (int i=0; i<str.length()/2; i++) {
            if (str.charAt(0)!=str.charAt(str.length()-1-i)) {

                result = false;
                break;
            }
        }
        System.out.print(result);

    }
}

