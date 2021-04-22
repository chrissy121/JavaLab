package test01_test;
import java.util.Random;
import java.util.Scanner;


public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);


        int firstDigit = random.nextInt(9)+1;
        String numbers = firstDigit + "";
        int num = 0;
      for (int i=1; i<6; i++) {
          num = random.nextInt(10);
          numbers += num;
      }

        System.out.println("numbers = " + numbers);

    }
}
