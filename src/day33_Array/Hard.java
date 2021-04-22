package day33_Array;

import java.util.Arrays;
import java.util.*;

public class Hard {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO. Write you code below this line.


       int i = 0;
       int sum =0;
        do {

            System.out.println("Day " + i + Arrays.toString(inhabitants) );
            sum = 0;
            for (int each=0; each<8; each++ ) {
                inhabitants[each] = inhabitants[each]/2;
                sum += inhabitants[each];
            }

            i++;

        } while (sum > 0);

        System.out.println("Day " + i + Arrays.toString(inhabitants) );


    }
}





