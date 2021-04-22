package OfficeHours.Mine;

public class StringExam1 {
    public static void main(String[] args) {
        String sentence = "The officer was identified as Eric Talley, 51, who served on the force since 2010. " +
                "He was the first officer at King Soopers,\nthe crime scene, after the shooting occurred" +
                " at about 2:30 p.m. His actions were called heroic.\"FoxNews\"";
        if (sentence.contains ("idiot") || sentence.contains("dumb") || sentence.contains("heck")) {
            System.out.println("Sorry, Message include bad words");
        } else {
            System.out.println(sentence);
        }

    }
}
