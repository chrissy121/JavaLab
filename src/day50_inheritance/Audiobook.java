package day50_inheritance;

public class Audiobook  extends Book{
    int length;
    String narrator;

    public void listenBook() {
        System.out.println("We can listen this book ");
        System.out.println("Title = " + title);
        System.out.println("Author = " + author);
        System.out.println("Price = " + price);
        System.out.println("Length = " + length);
        System.out.println("Narrator " + narrator);

    }
}
