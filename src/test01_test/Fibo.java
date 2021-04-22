package test01_test;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Fibo {
    public static void main(String[] args) {
        fib(3);
    }



    public static void fib(int num) {

     int first = 0;
     int second = 1;

     for (int i=0; i < num; i++){

         int temp =first;
         first = second;
         second = temp+second;
     }

        System.out.println(first);
    }
}
