package OfficeHours.Mine;
import java.util.Scanner;

public class PersonalInformation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many people you live with?");
        int numMember = scan.nextInt();
        scan.nextLine();

        if (numMember < 2 ) {
            System.out.println("Live with less than 2 people");
        }
        if (numMember >= 3 && numMember <= 6) {
            System.out.println("Live with 3 - 6 people");
        } else {
            System.out.println("Live with more than 6 people");
        }

        System.out.println("What city you live in?");
        String cityName = scan.nextLine();

        System.out.println("You live in downtown? yes or no ");
        String downTown = scan.nextLine();

        if (downTown.equals("yes")) {
            System.out.println("Have you thought about moving to the suburbs?");
            String subUrbs = scan.nextLine();

            if (subUrbs.equals("yes")) {
                System.out.println("Do it, its great");
            } else {
                System.out.println("You should think about it");
            }
        }
        System.out.println("What is your favorite animal?");
        String animalName = scan.nextLine();

        System.out.println("Wow " + animalName + " is a great animal");
        System.out.println("How many pets you want?");
        int numPets = scan.nextInt();
        scan.nextLine();
        System.out.println("Interesting, do you want " + numPets + " " + animalName + "?");
        scan.close();
    }
}
