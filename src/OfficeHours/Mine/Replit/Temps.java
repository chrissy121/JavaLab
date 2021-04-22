package OfficeHours.Mine.Replit;
import java.util.*;

public class Temps {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        // leave above code alone :)
        // assume you have String array of 5 items
        //and print first and last char of each items in one line

        //TODO: Write your code below
        String str = "";
        String str1="";
        for (int i=0; i<5; i++) {
            str= words[0];
        }
        int l = str.length();
        System.out.print(""+str.charAt(0)+str.charAt(l-1));
    }
}
