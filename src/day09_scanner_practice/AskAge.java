package day09_scanner_practice;
import java.util.Scanner;


public class AskAge {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" - First, How old are you? ");

        int age = input.nextInt();
        System.out.println(age + "-that's great age!");

        System.out.println(" - Next Question: What is your name? ");
        String name = input.next();

        System.out.println(name + "-that's nice name!");


    }
}
