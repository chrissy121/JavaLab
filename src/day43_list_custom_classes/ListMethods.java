package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListMethods {
    public static void main(String[] args) {
        System.out.println(getDays());
        System.out.println(" Too= " + getDays().size());
        System.out.println("Member: " + getDays().get(0));

        List<String> dayNames = getDays();
        dayNames.add("java day");

        //removeIf method - java 8 -> accepts lambda - and easy to remove without loop
        dayNames.removeIf(d -> d.length()==6);
        System.out.println(" dayName after removeIf=" + dayNames);
        List<Integer> ran = getRandomList(10);
        System.out.println("ran size = " + ran.size());

        System.out.println(ran);

        ran.removeIf(n -> n<90);
        System.out.println("nums = " + ran);


    }

    public static List<String> getDays(){
        List<String> days = new ArrayList<>();
        // List<String> days = new ArrayList<>(Arrays.asList("Monday, Tuesday, Wednesday..Sunday"));

        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        return days;
    }

    public static List<Integer> getRandomList(int size){

        List<Integer> list = new ArrayList<>();
        Random rd= new Random();

        for (int i=0; i<size; i++){

            list.add(rd.nextInt(101));
        }
        return list;
    }
}
