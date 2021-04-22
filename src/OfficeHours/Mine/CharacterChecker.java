package OfficeHours.Mine;
import java.util.Scanner;

public class CharacterChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your letter");
        String input = scan.nextLine();
        char ch = input.charAt(0);

        if (ch >= 65 && ch <= 90){
            System.out.print(ch + " UPPER CASE");
        } else if (ch >= 97 && ch <= 122){
            System.out.print(ch + " lower case");
        } else {
            System.out.print(ch + " not letter");
        }
    }
}
