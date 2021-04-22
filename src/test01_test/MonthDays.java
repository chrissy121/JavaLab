package test01_test;

import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter month number?");
        int num = scan.nextInt();

        if (num > 0 && num < 13) {
            if (num == 2) {
                System.out.println("28 days");
            } else if (num == 4 || num==6 || num==9 || num==11) {
                System.out.println("30 days");
            } else {
                System.out.println("31 days");
            }
        } else {
            System.out.println("Wrong number, please try again!");
        }
    }
}
