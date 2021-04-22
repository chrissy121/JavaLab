package OfficeHours.Mine.Replit;
import java.util.*;

public class MakeArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i =0; i < size; i++) {
            nums[i] = scan.nextInt();
        }

                //WRITE YOUR CODE HERE

        int newSize = 2 * size;
        int[] num2 = new int[newSize];

        for (int j=0; j< newSize ; j++) {
           if(j== newSize-1) {
               num2[j] = nums[nums.length-1];
           } else {
               num2[j] = 0;
           }
           System.out.print (num2[j]+ " ");
        }

    }
}
