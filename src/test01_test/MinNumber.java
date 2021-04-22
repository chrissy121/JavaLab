package test01_test;
import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter 3 numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if ( num1< num2 && num1< num3) {
            System.out.println("Minimum number = " + num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("Minimum number = " + num2);
        } else {
            System.out.println("Minimum number = " + num3);
        }
    }
}
