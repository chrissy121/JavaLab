package day49_static;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public  void add(int num) {
        System.out.println("adding = " + num);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(145);

        System.out.println(list);

    }

}
