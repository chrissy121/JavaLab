package day09_scanner_practice;
import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("******* F to C CONVERTOR PROGRAM ********");
        System.out.println("Enter Fahrenheit value: ");

        double fahValue = scan.nextDouble();
        double celValue =  (fahValue - 32) * 5 / 9;

        System.out.println( fahValue + " fahrenheit's value is " + celValue + " celsius");

    }
}
