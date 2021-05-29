package OfficeHours.Mine;

import java.util.ArrayList;
import java.util.Collections;

public class MjQ2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("i");
        list.add("Bart");
        list.add("Carl");
        list.add("i");
        list.remove("i");
        System.out.println(list);

        list.add(2, "mj");
        System.out.println(list);
       // System.out.println(list.remove(4)); //"Elmo"
       // System.out.println("=============");
        System.out.println(list);

        list.set(3, "Andy"); //solix even assign xiibel xuuchin utga
        System.out.println(list);

        list.remove(list.set(0, "Muhamed"));
        list.removeIf(each -> each.equals("Elmo"));
        System.out.println(list);

        System.out.println(Collections.frequency(list, "mj"));
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(50);
        list2.add(1, 0);
        System.out.println(list2);




    }
}
