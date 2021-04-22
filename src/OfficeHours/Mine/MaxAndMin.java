package OfficeHours.Mine;
import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a number");
        int min = Integer.MAX_VALUE;

        for (int i=1; i<=5; i++) {
            int num = scan.nextInt();

            if (num < min) {
                min = num;
            }
        }
        System.out.println("Min number is " + min);
    }
}
