package OfficeHours.Pracrice_04_05_2021;
import java.util.Random;
public class Random6DigitNumber {
    public static void main(String[] args) {
        /*
        Generate a random number that is six digits long. Each digit in this number should be unique,
        meaning the number 6 digit number should have 6 different character numbers that make it up.
        Print the number.
        HINTS: Loops, Strings, Random
         */

        Random random = new Random();

        String randomNumber = "";

        while (randomNumber.length() != 6) {

            int eachRandom = random.nextInt(10);

            if (!randomNumber.contains(""+eachRandom)) {
                randomNumber += eachRandom;
            }

        }
        System.out.println(randomNumber);


    }
}
