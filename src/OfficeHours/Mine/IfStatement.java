package OfficeHours.Mine;
/*
[If statement, operators]

Write a java program that can identify if a person is eligible to vote for the president.
Age of voting: 18. Print "Eligible to vote" or "not eligible to vote".

    => To make it dynamic change the three angles to be Scanner inputs

====================================================

[If statement, operators]

Write a program that will accept a boolean value. Print out the opposite of the given boolean

Ex: true -> false
    false -> true
 */
import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        System.out.println("Enter your age:");
        Scanner scan = new Scanner(System.in);

        byte age = scan.nextByte();
        if (age >= 18){
            System.out.println("Eligible to vote");
        }else {
            System.out.println("Not eligible to vote");
        }


    }
}
