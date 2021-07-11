package OfficeHours.Mine.JavaIQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dup_Array {
    public static void main(String[] args) {
        String [] myArr = {"alemdar","alemdar","tat","tat","oogi","oogi","alemdar","mustafa","ozan","chrissy"};
        System.out.println(Arrays.toString(dup_Array(myArr)));
    }

    public static String[] dup_Array(String[] arr) {
        List<String> newList = new ArrayList<>();
        for (String each : arr) {
            if(!(newList.contains(each))) {
                newList.add(each);
            }
        }
        String[] resultArr = new String[newList.size()];
        for (int i = 0; i < newList.size(); i++) {
            resultArr[i] = newList.get(i);
        }
        return resultArr;
    }
}
