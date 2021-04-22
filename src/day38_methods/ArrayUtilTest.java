package day38_methods;

import java.util.Arrays;

public class ArrayUtilTest {
    public static void main(String[] args) {

        int[] nums = {14, 12, 34, 567, 8};

        ArrayUtils.printArray(nums);
        ArrayUtils.printArray(new int[] {23, 3, 45, 6});

        System.out.println(ArrayUtils.sum(nums));
        System.out.println("sum = " + ArrayUtils.sum(new int[]{1, 2, 34}));

        System.out.println(ArrayUtils.contain(new int[] {1, 2, 32, 45}, 32));
        System.out.println("34 - found = " + ArrayUtils.contain(nums, 34));

    }
}
