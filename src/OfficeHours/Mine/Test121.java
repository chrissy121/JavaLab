package OfficeHours.Mine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Test121 {
    public static void main(String[] args) {
        ArrayList<Integer> ubs = new ArrayList<Integer>(Arrays.asList(2,3,74,5,6,12));
        Collections.sort(ubs);
        System.out.println(ubs);
        Collections.reverse(ubs);
        System.out.println(ubs);

        Collections.swap(ubs, 0, 5);
        System.out.println(ubs);

        ArrayList<String> ubs1 = new ArrayList<String>(Arrays.asList("Booyo", "Uuganaa", "Naraa", "Zoloo"));
        Collections.swap(ubs1, 0, 1);
        System.out.println(ubs1);

        int inBooyo = ubs1.indexOf("Booyo");
        int inUugana = ubs1.indexOf("Uuganaa");

        Collections.swap(ubs1, inBooyo, inUugana);
        System.out.println(ubs1);
        System.out.println("================");

        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(2,3,74,5,6,12));

        Integer temp = nums.remove(nums.size()-1);

        nums.add(nums.remove(0));
        nums.add(0, temp);
        System.out.println(nums);

        

    }

}
