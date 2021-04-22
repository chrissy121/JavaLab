package day11_conditional_statements;
import java.util.Scanner;

public class AmazonFreeShipping {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter total price:");
        double totalPrice = scan.nextDouble();

        if (totalPrice >= 25.0) {
            System.out.println("Free shipping eligible, Your total order:$" + totalPrice );
        }else {
            System.out.println("Not Eligible free shipping, Your total order:$" + totalPrice);
        }
        System.out.println("THANKS FOR SHOPPING AMAZON!");
    }

}
