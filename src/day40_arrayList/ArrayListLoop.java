package day40_arrayList;
import java.util.*;

public class ArrayListLoop {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        System.out.println(nums);
        System.out.println(nums.size());
        nums.add(34); nums.add(44); nums.add(3); nums.add(88);
        nums.add(500); nums.add(844); nums.add(3); nums.add(78);
        nums.add(340); nums.add(484); nums.add(893); nums.add(8118);

        System.out.println("nums = " + nums);

        nums.remove(0);
        System.out.println(nums);

        //nums.remove(88);
        nums.remove(new Integer(88));
        System.out.println(nums);

        // for loop - iterate through all values and print
        for(int i=0; i<nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        //for each loop, and print all in same line

        for (int each : nums) {
            System.out.print(each + " ");
        }

    }
}
