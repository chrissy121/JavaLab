package OfficeHours.Mine;

public class Cat {
    public static void main(String[] args) {
        String sentence = "catcatdog";
        String list = "cat";
        String list1= "dog";
        int count = 0;
        int count1 = 0;

        for (int i = 0; i<= sentence.length()-3; i++){
            if (sentence.substring(i, i+3).equals(list)) {
                count ++;
            }
        }
        System.out.println(count);

        System.out.println(sentence);

        for (int i = 0; i<= sentence.length()-3; i++){
            if (sentence.substring(i, i+3).equals(list1)) {
                count1 ++;
            }
        }
        System.out.println(count1);

        String ta="Cammom";
        ta.replace('a', 'D');
        System.out.println(ta);

    }
}
