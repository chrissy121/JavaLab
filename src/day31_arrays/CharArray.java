package day31_arrays;
import java.util. *;

public class CharArray {
    public static void main(String[] args) {
        char[] ch = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};

        for (char each: ch) {
            System.out.print(each + " ");
        }

        String sentence = new String (ch);
        System.out.println("\nsentence = " + sentence);

        String item = "wooden spoon" ;
        char[] itemArray = item.toCharArray();
        System.out.println("itemArray.length = " + itemArray.length);
        System.out.println("item.length() = " + item.length());

        String[] fruits = {"bananas", "apples", "kiwi", "mango", "papaya", "strawberry"};

       String fruitsStr = "";
        for (String each: fruits) {
           System.out.print(each+ "-");
           fruitsStr += each + "-";
       }
        System.out.println("\nfruits = " + fruitsStr);

        String[] languages = {"java", "python", "c++", "sql"};

        System.out.println(String.join("|", languages));
        System.out.println(String.join("###", languages));
        String joinedLanguages = String.join(" <> ", languages);
        System.out.println("joinedLanguages = " + joinedLanguages);

         int[] nums = {5, 1, 7, 0};
//         Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));




    }
}
