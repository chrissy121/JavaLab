package OfficeHours.Mine.ArrayPractice1;
import java.util.*;

public class AverageNumberArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] matrix = new int[size];
        for (int i=0; i < size; i++) {
            matrix[i] = scan.nextInt();
        }

        int sum = 0;
        int average = 0;
        for ( int element: matrix) {
        sum += element ;
        average = sum / matrix.length;
        }
        System.out.println("Average value = " + average);
    }
}
