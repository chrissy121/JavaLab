package day25;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for ( int count = 1; count <= 1000; count++ ) {
            sum = sum + count;
        }
        System.out.println("Sum = " + sum);


    }
}
