package OfficeHours.Mine;
import java.util.Scanner;

public class WhilePractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int count = 0;
        String unique = "";
        String dup = "";

        for (int i = 0; i< word.length(); i++) {
            count = 0;


            for (int j=0; j< word.length(); j++) {

                if (word.charAt(i) == word.charAt(j)) {
                    count++;
                }

            }


            if (count == 2) {
                unique += word.charAt(i) + ", ";

            }

        }


        System.out.println("Unique characters are: " + unique);

        int a=20;
        int b=89;

        int c = Math.abs(a-b);
        System.out.println(c);

    }
}
