package OfficeHours.Mine.Replit_04_17;

import java.util.Scanner;

public class DutlicateChars1 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.next()));

    }


    public static String uniqueChars(String str) {

        String res = "";

        for (int i = 0; i < str.length(); i++) {

            char findingChar = str.charAt(i);
            if (!res.contains("" + findingChar)) {
                   res += findingChar;
            }
        }
         return res;
    }

}
