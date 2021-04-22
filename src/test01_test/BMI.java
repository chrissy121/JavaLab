package test01_test;
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter mass (kilogram) and height (meters)");
        double mass = scan.nextDouble();
        double height = scan.nextDouble();

        double BMI = mass / (height * height);
        if (BMI< 18.5) {
            System.out.println(BMI + "- Underweight");
        } else if (BMI >= 18.5 && BMI < 25) {
            System.out.println(BMI + " - Normal weight");
        } else if (BMI>=25 && BMI < 30) {
            System.out.println( BMI + " - Overweight");
        } else {
            System.out.println(BMI + " - Obese");
        }

    }
}
