package day60_logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        try {
            System.out.println("Enter number");
            int num = scanner.nextInt();
            System.out.println("You entered " + num);
//            System.exit(0); //stop java all together, finally block will not run
        } catch (InputMismatchException e) {
            System.out.println("Invalid value entered!!");
        } finally {
            scanner.close();
            System.out.println("Finally block - runs always");
        }

    }
}
