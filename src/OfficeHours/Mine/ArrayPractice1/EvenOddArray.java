package OfficeHours.Mine.ArrayPractice1;

import java.util.Arrays;

public class EvenOddArray {
    public static void main(String[] args) {
        int[] matrix = {4, 1, 3, 14, 21, 12, 5};

//        int count =0;
//
//        for (int even : matrix) {
//            if (even % 2 == 0 ) {
//                count ++;
//            }
//        }
//        System.out.println("Even number " + count);
//        System.out.println("Odd number " + (matrix.length - count));

     int even = 0;
     int odd = 0;

     for (int each: matrix) {
         if (each % 2 == 0) {
             even++;
         } else {
             odd++;
         }
     }
     int[] evenNumbers = new int[even];
     int[] oddNumbers = new int[odd];

     for (int i=0, e=0, o=0; i<matrix.length; i++) {
         if (matrix[i] % 2 == 0) {
             evenNumbers[e++] = matrix[i];
         } else {
             oddNumbers[o++] = matrix[i];
         }

     }

        System.out.println("Even array: " + Arrays.toString(evenNumbers));
        System.out.println("Odd array: "+ Arrays.toString(oddNumbers));

    }
}
