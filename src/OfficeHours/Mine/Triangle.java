package OfficeHours.Mine;
import java.util.Scanner;
/*
[Triangle - If statement, operators]

A triangle is valid if the sum of all the three angles is equal to 180 degrees.
Write a program that declares three integers as angles and check whether the triangle is valid or not.
 Print "Valid triangle" or "Not a valid triangle".

    => To make it dynamic change the three angles to be Scanner inputs
 */
public class Triangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 angles");
        System.out.print("a ="); int a = scan.nextInt();
        System.out.print("b ="); int b = scan.nextInt();
        System.out.print("c ="); int c = scan.nextInt();
        int sum = a + b + c;
        boolean isTriangle = sum == 180;

       if(isTriangle) {
           System.out.println("Valid Triangle");
       }else {
        System.out.println("Not a valid Triangle");
       }
    }
}
