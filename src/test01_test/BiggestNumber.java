package test01_test;
import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1 == num2 && num1== num3){
            System.out.println("All integers are the same");
        } else if (num1 > num2 && num1 > num3) {
            System.out.println("The biggest number from " + num1+ ", " + num2 + " and " + num3 + " is: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The biggest number from " + num1 + ", " + num2 + " and " + num3 + " is: " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("The biggest number from " + num1 + ", " + num2 + " and " + num3 + " is: " + num3);
        }
    }
}
