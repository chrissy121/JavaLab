package test01_test;
import java.util.*;
public class GuestList {


            public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            String guestList = "";
            String ans = "no";
            String guestName = "";
            int count = 0;

            do {
                System.out.println("Please enter guest name:");
                guestName = input.next();

                guestList += (count != 0) ? ", " + guestName : guestName;

                System.out.println("Do you want to enter new guest name:");
                ans = input.next();
                count ++;
            } while (ans.equals("yes"));

            System.out.print("Guest's list: " + guestList);

       }
}
