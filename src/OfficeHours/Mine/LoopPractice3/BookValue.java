package OfficeHours.Mine.LoopPractice3;

import java.util.Locale;

public class BookValue {
    public static void main(String[] args) {
       /*
       Given a String book with all the text of your book. Figure out how much you will make from your book.
       Each chapter you have in your book will add 10 $ value to your book.
       Go through your book and figure out the value of the book. Ignore case sensitivity.
       Check the next slide for the Book text you can use to test.

         14 Chapters -> value of the book: 140
        */
        String book =  "Java textbook By Murodil. Chapter 1 datatypes and variables. Chapter 2 conditional statements. " +
                "chapter 3 String manipulation. Chapter 4 Loops. Chapter 5 Arrays. Chapter 6 Methods.\n" +
                "chapter 7 ArrayList. chapter 8 instance and static. Chapter 9 Constructors.\n" +
                "Chapter 10 Encapsulation and Inheritance. Chapter 11 Abstraction and Polymorphism.\n" +
                "Chapter 12 Exceptions. Chapter 13 Collections. Chapter 14 Learn more.";

        String word = "chapter";
        int count = 0;
        book= book.toLowerCase();

        for (; ;) {
            int index = book.indexOf(word);
            if (index == -1) {
                break;
            }
            count++;
            book = book.substring(index + 7);
        }
        System.out.println("Total value = $" + ( 10 * count));
    }
}
