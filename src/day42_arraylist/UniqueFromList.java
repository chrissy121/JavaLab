package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniqueFromList {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 4, 4, 1, 5, 6, 0, 6));
        List<Integer> uniqueList = new ArrayList<>();

        for (int each : nums) {
            if (Collections.frequency(nums, each)==1){
               uniqueList.add(each);
            }
        }
        System.out.println(uniqueList);

        }

//        public static List<Integer> getUniqueIntegers(List<Integer> nums) {
//            List<Integer> uniqueList = new ArrayList<>();
//
//            for (int each : nums) {
//                if (Collections.frequency(nums, each)==1){
//                    uniqueList.add(each);
//                }
//            }
//           return uniqueList;
//
//        }


}








