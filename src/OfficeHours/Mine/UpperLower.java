package OfficeHours.Mine;

public class UpperLower {
    public static void main(String[] args) {

     /*
     ======================================
     char ch='j';
        for (int i= 65; i<=90; i++) {
           if (ch == i) {
               System.out.print("UPPER CASE ");

           }
        }
        for (int i = 97; i<=122; i++ ) {
            if (ch== i) {
                System.out.print("lower case ");
            }
        }
        =====================================
        */

        String letter = "lower";

        if (letter.equals("upper")) {
            for (char i= 'A'; i<='Z'; i++) {
                 System.out.print(i + " ");
            }
        } else if (letter.equals("lower")) {
            for (char i = 'a'; i <= 'z'; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
