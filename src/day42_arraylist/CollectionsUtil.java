package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsUtil {
    public static void main(String[] args) {
        List<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('j', 'a', 'v', 'a', 'i', 's', 'f', 'u', 'n'));
        System.out.println("size = "+ letters.size());
        System.out.println(letters);

        Collections.reverse(letters);

        System.out.println("reversed = " + letters);
        // find count of a in letters
        System.out.println(Collections.frequency(letters, 'a'));

        System.out.println("Max char = " + Collections.max(letters));
        System.out.println("Min char = " + Collections.min(letters));

        Collections.replaceAll(letters, 'a', 'k');
        Collections.replaceAll(letters, 'i', 'j');
        System.out.println(letters);

        Collections.sort(letters);
        System.out.println(letters);

        List<Integer> nums = Arrays.asList(23, 1, 43, 5, 234, -9, 0, 1, 5, 5, 78, 5, 56);
        System.out.println("nums = " + nums);
        Collections.reverse(nums);
        System.out.println("after reversed" + nums);

        int max = Collections.max(nums);
        int min = Collections.min(nums);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        int countOfFives = Collections.frequency(nums, 5);
        System.out.println("countOfFives = " + countOfFives);

        Collections.replaceAll(nums, 5, 50);
        System.out.println("after replaceAll = " + nums);

        Collections.sort(nums, Collections.reverseOrder());

        System.out.println("after reverse sort = " + nums);

        Collections.shuffle(nums);
        System.out.println("After shuffle = " + nums);


    }

}
