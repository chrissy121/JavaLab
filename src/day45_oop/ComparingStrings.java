package day45_oop;

public class ComparingStrings {
    public static void main(String[] args) {
        String word1 = "java";
        String word2 = "java"; // re-use from String pool
        String word3 = new String("java");  // create new object in Heap, outside String pool
        String word4 = new String("java"); // create New object in Heap

        System.out.println(word1==word2); //true
        System.out.println(word1==word3); //false
        System.out.println(word3==word4); //false

        System.out.println(word1.equals(word2));
        System.out.println(word1.equals(word3));
        System.out.println(word1.equals(word4));

    }
}
