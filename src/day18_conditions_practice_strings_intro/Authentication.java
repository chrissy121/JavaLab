package day18_conditions_practice_strings_intro;
import java.util.Scanner;

public class Authentication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your SSN last 4 digit: ");
        int last4SSN = scan.nextInt();
        System.out.println("Enter your pin code: ");
        int pinCode = scan.nextInt();

        int expLast4SSN = 1111;
        int expinCode = 1121;

        if (last4SSN == expLast4SSN && pinCode == expinCode) {
                System.out.println("Authentication successful");
            } else {
               System.out.println("Authentication unsuccessful");
               if ( last4SSN != expLast4SSN){
                System.out.println("SSN is incorrect");
               }
               if (pinCode != expinCode) {
                   System.out.println("Pin code is incorrect");
               }
        }
    }
}
