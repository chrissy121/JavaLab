package day36_methods_with_return.Video;

import java.util.Arrays;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(2, 4, 5);

        myList.forEach(n-> System.out.print(n*n + " "));
        System.out.println();
        
        myList.forEach(n-> {
            if(n>2) {
                System.out.println( n*n );
            }

        });

    }
}
