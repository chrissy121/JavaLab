package day09_scanner_practice;
import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        System.out.println("Input Num1: ");

        int num1 = in1.nextInt();

        System.out.println("Input Num2: ");
        int num2 = in2.nextInt();
        int sum = num1 + num2;

        System.out.println("Oh, TOTAL IS:" + sum);

    }
}
