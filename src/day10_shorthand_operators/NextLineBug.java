package day10_shorthand_operators;
import java.util.Scanner;

public class NextLineBug {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter rent month");

       double rent = scan.nextDouble();

       scan.nextLine(); // fix the known bug WORK AROUND
       String month = scan.nextLine();

       System.out.println(rent);
       System.out.println(month);

    }
}
