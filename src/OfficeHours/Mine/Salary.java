package OfficeHours.Mine;
import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your salary:");
        double salary = scan.nextDouble();

        System.out.println("Are you FullTime Worker: True\\False?");
        boolean isFullTime=scan.nextBoolean();
        if (isFullTime) {
          salary += 20000;
          System.out.println("Final salary is $" + salary);
         }else{
          salary += 5000;
          System.out.println("Final salary is $" + salary);
      }
    }
}
