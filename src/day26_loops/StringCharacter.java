package day26_loops;

public class StringCharacter {
    public static void main(String[] args) {
        String word = "Bolormaa";

        for (int i=word.length()-1; i>=0 ; i--){
            System.out.print(word.charAt(i));
        }
    }
}
