package day29_nestedloop_arrays;

public class StringNestedLoop {
    public static void main(String[] args) {
/*
1) find duplicates and count
2) find unique characters(appearing only once)
3) print character and number of occurences
 */
        String word = "hello";

        for (int i=0; i<word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                System.out.print(word.charAt(j));
            }
            System.out.println(); // new line after inner loop
        }


    }
}
