package day31_arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] nums = {5, 1, 7, 0, -4, 44, 33};

        // print all nums in same line
        System.out.println(Arrays.toString(nums));

        //sort nums
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("min value: " + nums[0]);
        System.out.println("max value: " + nums[nums.length-1]);

//        Arrays.sort(nums, Collection.reverseOrder());

        String[] words = {"Java", "C#", "C++", "Kotlin", "Ruby", "Assembly"};
        System.out.println(Arrays.toString(words));

        System.out.println("[" + String.join (", ", words)+ "]");

        //sort words in alphabetic and ASCII table
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        // sort words in reverse order
        Arrays.sort(words, Collections.reverseOrder());
        System.out.println(Arrays.toString(words));

        int[] nums2 = {33, 55, 123, 400};
        Arrays.sort(nums2);
        System.out.println(Arrays.binarySearch(nums2, 55));
        System.out.println(Arrays.binarySearch(nums2, 1));

        System.out.println("-----------------------------");

        int[] intArray = {2, 13, 5, 64, 123};

        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

        String[] names = {"John", "Adam", "Don"};

        Arrays.sort(names);


        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.binarySearch(names, "Don"));






    }
}
