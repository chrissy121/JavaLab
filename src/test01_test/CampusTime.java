package test01_test;
import java.util.Scanner;

public class CampusTime {
    public static void main(String[] args) {
        /*
        Campus time: User enters a time(hour in 24 hour format) and will be able to find out

        if the campus is open or not
> Campus is open from 8 am(8) to 11 pm (23)
> If user enters a time within the open time they should see message :
 “open” but if the time entered is outside of operating hours they should see: “ closed”
> If the user enters an invalid hour (negative number or more than 24 hours)
they should see an error message: “invalid time”
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a time");
        int time = scan.nextInt();
        if (time < 0 && time >24) {
            System.out.println("Invalid time");
        } else if (time >= 8 && time < 24) {
            System.out.println("Open: 8am - 11pm");
        } else {
            System.out.println("closed: 11pm - 7am ");
        }
    }
}
