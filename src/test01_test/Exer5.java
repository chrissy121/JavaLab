package test01_test;
import java.util.*;

public class Exer5 {
    public static void main(String[] args) {
        String a = "abc";
        String b = "cab";

        System.out.println(checking(a, b));


    }

    public static boolean checking(String a, String b) {


            char[] ch1 = a.toCharArray();
            char[] ch2 = b.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            String a1 = "";
            String a2 = "";

            for(char each : ch1) {
             a1 += each;
            }
            for(char each : ch2) {
                a2 += each;
            }

            return a1.equals(a2);


    }
}
