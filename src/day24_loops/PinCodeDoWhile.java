package day24_loops;
import java.util.*;

public class PinCodeDoWhile {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int pinCode;


        int secretPincode = 1234;
        do {
            System.out.println("Enter your pincode: ");
            pinCode = scan.nextInt();

        } while(pinCode != secretPincode);
        System.out.println("Welcome to you account");
    }
}
