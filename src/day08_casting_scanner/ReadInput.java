package day08_casting_scanner;
import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How old are you? ");
        int age = input.nextInt();

        System.out.print("You answered: " + age);

    }
}
