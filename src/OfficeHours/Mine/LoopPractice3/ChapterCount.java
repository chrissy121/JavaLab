package OfficeHours.Mine.LoopPractice3;

public class ChapterCount {
    public static void main(String[] args) {

        String book =  "Java textbook By Murodil. Chapter 1 datatypes and variables. Chapter 2 conditional statements. " +
                "chapter 3 String manipulation. Chapter 4 Loops. Chapter 5 Arrays. Chapter 6 Methods.\n" +
                "chapter 7 ArrayList. chapter 8 instance and static. Chapter 9 Constructors.\n" +
                "Chapter 10 Encapsulation and Inheritance. Chapter 11 Abstraction and Polymorphism.\n" +
                "Chapter 12 Exceptions. Chapter 13 Collections. Chapter 14 Learn more.";

        int count = 0;
        book = book.toLowerCase();


        while (book.toLowerCase().contains("chapter")) {

            book = book.replaceFirst("chapter", "");
            count ++;



        }

        System.out.println( count * 10 );

    }
}
