package day24_loops;
import java.util.Scanner;

public class NoxojXiisen {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int input;
        int secretNumber = 6789;
         /*

         secretNumber --> 0-100

        guessingNumber = 0

        DO
        "Guess the secret number"
        guessingNumber -> from nextInt

        if guessingNumber > secretNumber
        print "Wrong, your number is too large"
        if guessingNumber < secretNumber
        print "Wrong, your number is too small"

        WHILE (secretNumber is not guessingNumber)

        "Congratulations, you won! secret number: 44"
                */
        do {
            System.out.println("Enter your  number");
            input = scan.nextInt();
            System.out.println("Congratulations, you won! secret number: " + input);
        } while ( input == secretNumber);

        System.out.println(" Wrong, your number is too small ");
    }
}
