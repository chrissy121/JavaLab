package OfficeHours.Mine;
import java.util.Scanner;

public class QualificationForArmy {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your citizenship");
        String citizen = scan.nextLine();

        System.out.println("Are you resident?");
        boolean resident = scan.nextBoolean();
        scan.nextLine();

        if (citizen.equalsIgnoreCase("USA") || resident ) {

            System.out.println("Enter your age: ");
            int age = scan.nextInt();
            scan.nextLine();

            if (age >= 18 && age <= 35) {

                System.out.println("Did you graduate High School?");
                boolean hasHighSchoolDiploma = scan.nextBoolean();
                scan.nextLine();

                if (hasHighSchoolDiploma) {
                    System.out.println("You are qualified for the US Army");
                } else {
                    System.out.println("You must have a high school diploma");
                }
            } else {
                System.out.println("Your age must be between 18 to 35 years old");
            }
        } else {
            System.out.println("You must be a US citizen or a Resident");
        }
    }
}
