package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodWithListReturn {
    public static void main(String[] args) {

//      System.out.println(System.nanoTime());
        long start = System.nanoTime();
        List<Integer> myList = getIntegerList();
        long end = System.nanoTime();

        System.out.println("ArrayList time = " + (end-start));


    //  System.out.println("myList = " + myList);

        long startArr = System.nanoTime();
        int[] arr  = getIntegerArray();
        long endArr = System.nanoTime();
        System.out.println("Array time = " + (endArr-startArr));

//        System.out.println(Arrays.toString(arr));


    }

    public static List<Integer> getIntegerList() {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<=1_000_000; i++) {
            list.add(i);
        }
        return list;
    }
    public static int[] getIntegerArray(){
        int[] myArr = new int[1000001];
        for (int i = 0; i < 1_000_000; i++) {
            myArr[i]=i;
        }
        return myArr;
    }


}
