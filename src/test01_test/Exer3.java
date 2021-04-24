package test01_test;
import java.util.*;

public class Exer3 {
    public static void main(String[] args) {

        System.out.println(reverse(-267));


    }
    public static int reverse(int n) {
        String str = "" + n;

        int n1 = Integer.parseInt(str.substring(1));
        return n1;
    }


}
