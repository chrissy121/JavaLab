package test01_test;

import java.util.Random;

public class MyRandom {
    public static void main(String[] args) {
        Random rdm = new Random();

        int firstDigit = rdm.nextInt(9)+1;
        String str = firstDigit+"";

        do {
            str += rdm.nextInt(10);

           } while (str.length()!=6);

        System.out.println(str);

    }
}
