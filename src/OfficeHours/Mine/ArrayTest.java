package OfficeHours.Mine;
import java.util.*;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] myArr = new int[size];

        // 0, 2, 0, 4, 0, 6, 0, 8

        for (int i = 1; i < myArr.length; i += 2) {
            myArr[i] = i + 1;
        }

        System.out.println(Arrays.toString(myArr));
        String str = "Selenium is fun";
        char[] chr = str.toCharArray();



    }
}
