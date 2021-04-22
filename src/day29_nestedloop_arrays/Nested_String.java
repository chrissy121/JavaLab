package day29_nestedloop_arrays;

public class Nested_String {
    public static void main(String[] args) {

        String word = "java";
        for (int i=0; i< word.length(); i++) {
            for (int j=0; j<=i; j++) {
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }

    }

}
