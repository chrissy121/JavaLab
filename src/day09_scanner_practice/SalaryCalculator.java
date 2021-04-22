package day09_scanner_practice;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input your hourly rate please? ");

        double salary = input.nextDouble();
        double weeklyPay = salary * 40;
        double monthlyPay = weeklyPay * 52 /12;
        double annualPay = monthlyPay *12;

        System.out.println("Weekly Salary is:   " + weeklyPay);
        System.out.println("Monthly Salary is:  " + monthlyPay);
        System.out.println("Annual Salary is:   " + annualPay);
    }
}
