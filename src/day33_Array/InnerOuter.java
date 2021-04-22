package day33_Array;

import java.util.*;

public class InnerOuter {
    public static void main(String[] args) {


        int[] inner = {2, 1, 7, 4};
        int[] outer = {1, 2, 3, 4, 5, 6, 7};

        Arrays.sort(inner);
        Arrays.sort(outer);

        boolean result = false;
        System.out.println(Arrays.toString(inner));
        System.out.println(Arrays.toString(outer));


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                if (inner[i] == outer[j]) {
                    result = true;
                    break;
                }
            }
            if (!result) {
                break;
            }
        }
        System.out.println(result);
    }
}
