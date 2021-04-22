package day09_scanner_practice;
import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cents: ");
        int cents = scan.nextInt();

        int dollars = cents / 100;
        int remaingingCents = cents % 100;

        System.out.println("In " + cents + " cents: " + dollars + " dollars " + remaingingCents+ " cents");
    }
}
