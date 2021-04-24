package test01_test;

import java.util.Arrays;

public class Exer1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {5, 6, 7, 56, 78};

        System.out.println(Arrays.toString(convert(a, b)));


    }

    public static int[] convert(int[] a, int[] b) {
        int[] myArr = new int[a.length + b.length];
        int i =0;

        for (int each : a) {
            myArr[i]=each;
            i++;
        }
        for (int each : b) {
            myArr[i]=each;
            i++;
        }

        return myArr;
    }

}
