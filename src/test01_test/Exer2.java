package test01_test;
import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Exer2 {
    public static void main(String[] args) {

        ArrayList <String> names = new ArrayList<> (Arrays.asList("Ahmed", "Chrissy", "Mindy","Ahmed", "Ahmed", "Tatiana"));

        names.removeAll(Arrays.asList ("Ahmed"));

        System.out.println(names);

    }


}
