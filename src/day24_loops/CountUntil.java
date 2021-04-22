package day24_loops;
import java.util.Scanner;

public class CountUntil {
    public static void main(String[] args) {
        int number;
        Scanner keyword = new Scanner (System.in);
        System.out.println("Enter number to count until: ");
        number = keyword.nextInt();
        int start = 1;

        while(start <= number) {
            System.out.print(start + " ");
            start++;
        }
    }
}
