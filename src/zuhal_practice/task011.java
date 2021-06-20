package zuhal_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task011 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,7,8,8};
        Arrays.sort(arr);
        int counter =0;
        int currentNum = arr[0];

        for(int i=0; i < arr.length; i++) {

            if(arr[i] == currentNum) {
                counter++;
            } else {
                System.out.println(currentNum + " repeats " + counter + " times");
                currentNum = arr[i];
                counter = 1;
            }
        }
        System.out.println(currentNum + " repeats " + counter + " times");
    }
}
