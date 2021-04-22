package test01_test;

import java.util.*;

    public class EvenOdd {
        public static void main(String[] args) {
            //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
            // Variables are already declared and given
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number:");
            int number = input.nextInt();
            int remainder= number % 2;
            //CODE HERE
            if (remainder == 0) {
                System.out.println(number + " is even");
            }else{
                System.out.print(number + " is odd");
            }
        }

}
