package day29_nestedloop_arrays;


public class ArraysIntro {
    public static void main(String[] args) {
        int[] num = new int[3];
        num[0] = 5;
        num[1] = 13;
        num[2] = 6;
        System.out.println(num[0]);
        System.out.println("value at index 1 = " + num[1]);
        System.out.println("value at index 1 = " + num[2]);

        int i = 0;

        System.out.println(num[i]);
        i++;
        System.out.println(num[i]);

        System.out.println("number of elements = " + num.length);

        // store length of array into len variable

        int len = num.length;
        System.out.println("len = " + len);

        num[2]=num[1];

    }
}
