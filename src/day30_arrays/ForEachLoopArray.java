package day30_arrays;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class ForEachLoopArray {
    public static void main(String[] args) {

        int[] data = {1, 3, 34, 20089, 457, 5643, 565};
        for ( int each : data) {
            System.out.println(each);
        }


        for (int n : data) {
            System.out.print( n+ " ");
        }
        System.out.println();
        for (int i = 0; i< data.length; i++) {
            System.out.println(data[i]);
        }

        System.out.println("last element: " + data[data.length-1]);


        for (int j=data.length-1; j>=0; j--) {
                System.out.print (data[j]+ " ");
            }

    }
}
