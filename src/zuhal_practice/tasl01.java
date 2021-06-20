package zuhal_practice;
import java.util.*;

public class tasl01 {

    public static void main(String[] args) {


        int[] arr = {1, 1, 2, 2, 2, 7, 8, 8};

        Map<Integer, Integer> cnt = new HashMap<>();
        int c=0;
        for (int i=0; i<arr.length; i++ ) {
            c = cnt.getOrDefault(arr[i], 0);
            cnt.put(arr[i], c+1);
        }

        System.out.println(cnt);
    }


}
