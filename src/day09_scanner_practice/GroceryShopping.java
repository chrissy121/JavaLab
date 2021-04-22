package day09_scanner_practice;
import java.util.Scanner;

public class GroceryShopping {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter price for milk: ");
        double milkPrice = input.nextDouble();

        System.out.println("Enter price for Bread: ");
        double breadPrice = input.nextDouble();

        System.out.println("Enter price for Cucumber: ");
        double cucumberPrice = input.nextDouble();

        double total = milkPrice + breadPrice + cucumberPrice;
        System.out.println("Total price is: = $" + total);

    }
}
