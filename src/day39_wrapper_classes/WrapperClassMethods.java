package day39_wrapper_classes;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10, 5));
        System.out.println(Integer.sum(50, 35));
        System.out.println(Integer.min(2, -8));
        System.out.println("MIN INT: " + Integer.MIN_VALUE);
        System.out.println("MAX INT: " + Integer.MAX_VALUE);

        System.out.println(Double.max(234.5, 67.4));
        System.out.println("MIN DOUBLE : " + Double.MIN_VALUE);
        System.out.println(Double.compare(5, 1)); // first larger than second return =1
        System.out.println(Double.compare(5, 5)); // first is equal the second = 0
        System.out.println(Double.compare(5, 67));

        System.out.println(Character.isDigit('8'));
        System.out.println(Character.isDigit('v'));
        System.out.println(Character.isAlphabetic('8'));
        System.out.println(Character.isLetter('r'));

        char letter = 'A';


        if(Character.isUpperCase(letter)) {
            System.out.println("it is uppercase");
        }
        String word = "Java iS FuN";
        for (int i=0; i<word.length(); i++) {
            if(Character.isUpperCase(word.charAt(i))) {
                System.out.print(word.charAt(i));

            }
        }

        //System.out.println(Character.MIN_VALUE);
    }
}
