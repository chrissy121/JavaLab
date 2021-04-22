package OfficeHours.Mine;
import java.util.*;
public class StringExam7 {

            public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String word = scan.next();
            //YOUR CODE HERE
            if (word.length() != 1) {
                if ((word.length() >= 3 && word.length() % 2 != 0)) {
                    int index = word.length() / 2;
                    System.out.print(word.charAt(index));
                }
                if ((word.length() >= 3 && word.length() % 2 == 0)) {
                    int index = word.length() / 2;
                    System.out.print(word.substring(index - 1, index + 1));
                }
                if (word.length() == 2) {
                    System.out.print("" + word + word);
                }
            } else {
                    System.out.print("" + word + word + word);
                }


            }

}
