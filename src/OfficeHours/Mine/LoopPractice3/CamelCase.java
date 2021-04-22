package OfficeHours.Mine.LoopPractice3;

public class CamelCase {
    public static void main(String[] args) {
        String word = "thisHasManyWordsToFind";
        int count = 1;
        for (int i= 0; i< word.length(); i++){
            if(word.charAt(i)>=65 && word.charAt(i)<=90) {
               count++;
            }
        }
        System.out.println(count);
    }
}
