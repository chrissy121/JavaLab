package day13_conditional_statements;

import java.util.Scanner;

public class NiceDayorNot {
    public static void main(String[] args) {
        System.out.println("Enter outside temperature?");
        Scanner scan = new Scanner(System.in);
        int temp = scan.nextInt();

        if ( temp >= 70) {
            System.out.println("It is a beautiful day!\nLets code java!");
        } else {
            System.out.println("It is kind of cold today\nStay home and code java!");
        }
    }
}
