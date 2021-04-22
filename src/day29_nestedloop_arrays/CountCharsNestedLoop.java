package day29_nestedloop_arrays;

public class CountCharsNestedLoop {
    public static void main(String[] args) {
      String word = "java";
      int count =0;
        for (int i=0; i < word.length(); i++){
            char l = word.charAt(i);
            for (int j = 0; j < word.length(); j++) {
                char m = word.charAt(j);
                if (m == l) {
                    count ++;
                }
            }
            System.out.println(l + "= " + count);
        }

    }
}
