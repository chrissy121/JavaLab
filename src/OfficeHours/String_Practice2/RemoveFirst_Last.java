package OfficeHours.String_Practice2;
import java.util.Scanner;

public class RemoveFirst_Last {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String firstWord = scan.next();
        String secondWord = scan.next();

        System.out.println(firstWord.substring(1));
        System.out.println(secondWord.substring(0, secondWord.length()-1));
    }
}
