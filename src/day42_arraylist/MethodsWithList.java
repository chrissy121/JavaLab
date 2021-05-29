package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithList {
    public static void main(String[] args) {

    //declare String arraylist and add values
    List<String> words = new ArrayList<>();
    words.add("java");  words.add("html");  words.add("selenium");
    words.add("a"); words.add("input"); words.add("title");

    //pass words list to printStrList method
    printStrList(words);
    printStrList(Arrays.asList("select", "option", "br", "python", "sql", "api"));

        System.out.println("sum = " + sumIntegerList(Arrays.asList(2, 34, 56, 56, 876, 0, 89)));

    }
    public static void printStrList(List<String> stringList) {
        for(String each: stringList){

            System.out.print(each + " ");
        }
        System.out.println();
  }
  public static int sumIntegerList(List<Integer> integers) {
    int sum = 0;
      for (int i : integers) {
          sum += i;
      }
    return sum;
  }

}

