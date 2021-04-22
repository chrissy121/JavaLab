package test01_test;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Enter your code here
        Scanner scan= new Scanner(System.in);

        System.out.println("Welcome to the Grader!");
        System.out.println("Please enter subject name number 1 and score for this subject");


        String sub1 = scan.nextLine();
        double score1 = scan.nextDouble();
        scan.nextLine();

        System.out.println("Please enter subject name number 2 and score for this subject");
        String sub2 = scan.nextLine();
        double score2 = scan.nextDouble();
        scan.nextLine();

        System.out.println("Please enter subject name number 3 and score for this subject");
        String sub3 = scan.nextLine();
        double score3 = scan.nextDouble();
        scan.nextLine();

        System.out.println("Please enter subject name number 4 and score for this subject");
        String sub4 = scan.nextLine();
        double score4 = scan.nextDouble();
        scan.nextLine();

        System.out.println("Please enter subject name number 5 and score for this subject");
        String sub5 = scan.nextLine();
        double score5 = scan.nextDouble();

        double average = (score1 + score2 + score3 + score4 + score5)/5;

        System.out.println("Summary: " + sub1 + "-" + score1 + "," + sub2 + "-" + score2 + "," + sub3 + "-" + score3 + "," + sub4 + "-" + score4 + "," + sub5 + "-" + score5 );

        System.out.println("Your average score is: " + average);

    }
}