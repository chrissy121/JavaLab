package OfficeHours.Mine;
/*
Write a program that will give the grade after the retake.
The program should read a score of the test and which attempt it was.

    If its the first attempt -> subtract 10%
    If its the second attempt -> subtract 20%
    If its the third attempt -> subtract 35%
 */
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your Score?");
        double score = scan.nextInt();
        System.out.println("Which attempt it is? 1\\2\\3");
        byte attempt = scan.nextByte();

        if(attempt == 1) {
            score = score - score * 0.1;
            System.out.println("Your Grade: " + score);
        }
        if(attempt == 2) {
            score = score - score * 0.2;
            System.out.println("Your Grade: " + score);
        }
        if(attempt == 3) {
            score = score - score * 0.35;
            System.out.println("Your Grade: " + score);
        }
    }
}
