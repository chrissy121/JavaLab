package day37_methods_overloading;
import java.util.*;


public class FixWords {
           public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println(mergeStrings(in.next(), in.next()));

        }

        public static String mergeStrings(String one, String two) {

            String str = "";

            int l = one.length();
            String urtUg = two;

            if ( two.length() < l ) {
                l = two.length();
                urtUg = one;
            }

            for(int i = 0; i < l; i++) {

                str += one.charAt(i) + ""+ two.charAt(i);

            }
            return str + urtUg.substring(l);
        }


}
