package day09_scanner_practice;
import java.util.Scanner;

public class SpeedCheckV2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Current Speed Limit:");
        int speedLimit = 45;


        int currentSpeed = input.nextInt();

        int overTheLimit = currentSpeed - speedLimit;
        System.out.println("You are driving " + overTheLimit + "mph over the limit.\nSlow down!");



    }
}
