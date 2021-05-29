package day41_arraylist;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysasList {
    public static void main(String[] args) {

        //1.  fixed, no add/remove
        List<Integer> nums1 = Arrays.asList(34, 12, 453, 23);
        System.out.println("nums = "+ nums1);

        //2. more flexible
        List <Integer> nums2 = new ArrayList<>(Arrays.asList(23, 400, 2, 34, 2));
        System.out.println(nums2);
        nums2.add(33);
        nums2.add(342);
        nums2.remove(0);
        nums2.remove(new Integer(400));
        System.out.println("nums2 = " + nums2);

        List <String> drinksWithCaffeine = new ArrayList<>(Arrays.asList("coffee", "tea", "monster", "red bull", "coke", "pepsi", "mdew", "kambucha", "celsius"));
        int caffeineAmount = 0;
        System.out.println(drinksWithCaffeine);

        for (String drink : drinksWithCaffeine){
            if(drink.equals("monster") || drink.equals("red bull") ||drink.equals("celsius") ){
                caffeineAmount = 150;
                System.out.println(drink + " --> " + caffeineAmount);
            } else if (drink.equals("coffee") || drink.equals("kambucha") ){
                caffeineAmount = 112;
                System.out.println(drink + " --> " + caffeineAmount);

            } else if (drink.equals("tea") || drink.equals("coke") || drink.equals("pepsi") || drink.equals("celsius") ){
                caffeineAmount = 35;
                System.out.println(drink + " --> " + caffeineAmount);

            }
        }

            for (String drink : drinksWithCaffeine) {

                switch (drink) {
                    case "monster":   case "red bull":  case "celsius":
                        caffeineAmount = 150;
                        System.out.println(drink + " --> " + caffeineAmount);
                        break;
                    case "coffee":   case "kambucha":
                        caffeineAmount = 112;
                        System.out.println(drink + " --> " + caffeineAmount);
                        break;
                    case "tea":   case "coke":  case "pepsi": case "mdew":
                        caffeineAmount = 35;
                        System.out.println(drink + " --> " + caffeineAmount);
                }
            }
            drinksWithCaffeine.forEach(drink -> System.out.println(drink.toUpperCase()));

            drinksWithCaffeine.forEach(each -> {
                System.out.println("---------------");
                System.out.println("each = "+ each);
                System.out.println("---------------");


            });

    }
}
