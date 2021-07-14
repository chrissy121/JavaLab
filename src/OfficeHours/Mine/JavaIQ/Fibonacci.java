package OfficeHours.Mine.JavaIQ;
/*
5
        0 1 1 2 3 5 8 13
 */

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        isFibonacci(1);

    }
    public static void isFibonacci(int num) {
        int [] myArr = new int[num+1];

        myArr[0] = 0;
        myArr[1] = 1;

        if(num > 2) {
            for (int i = 2; i < myArr.length ; i++) {
               myArr[i] = myArr[i-1]+myArr[i-2];

                }
            }
        System.out.println(Arrays.toString(myArr));

      }
}
