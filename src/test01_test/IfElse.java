package test01_test;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("ENTER YOUR SCORE?");
        int score = scan.nextInt();
        if (score > 90) {
            System.out.println("Great score: A!");
        }else if (score > 80) {
            System.out.println("Good score: B!!");
        }else if (score > 70) {
            System.out.println("Ok score: C!!!");
        } else {
            System.out.println("STUDY HARDER !!!!!");
        }
    }
}
