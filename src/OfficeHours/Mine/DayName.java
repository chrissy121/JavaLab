package OfficeHours.Mine;
import java.util.*;

public class DayName {
    public static void main(String[] args) {
            // DO NOT CHANGE

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter number:");
            int day = scan.nextInt();

            //WRITE YOUR CODE HERE
            switch (day) {
                case 1: System.out.print("Monday");
                    break;
                case 2: System.out.print("Tuesday");
                    break;
                case 3: System.out.print("Wednesday");
                    break;
                case 4: System.out.print("Thursday");
                    break;
                case 5: System.out.print("Friday");
                    break;
                case 6: System.out.print("Saturday");
                    break;
                case 7: System.out.print("Sunday");
                    break;
                default :
                    System.out.print("Not a valid day");
                    break;

            }

        }

}
