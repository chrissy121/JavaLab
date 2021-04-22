package day24_loops;
import java.util.Scanner;

public class GiveMe5$ {
    public static void main(String[] args) {

    int dollar = 0;
    while (dollar !=5) {
        System.out.println("Give me 5 dollars");
        Scanner scan = new Scanner(System.in);
        dollar = scan.nextInt();
    }
        System.out.println("Thank you I got 5$ ");
    }
}
