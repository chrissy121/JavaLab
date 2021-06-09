package day50_inheritance;

public class BookTest {
    public static void main(String[] args) {

        Book book1 = new Book();
        book1.title = "intro to java";
        book1.author = "Savitch";
        book1.type = "programming";
        book1.price = 85.0;

        System.out.println(book1.title);
        System.out.println(book1.author);
        System.out.println(book1.type);
        System.out.println(book1.price);
        System.out.println("======================");

        EBook ebook1 = new EBook();
        ebook1.title = "Software Testing";
        ebook1.author = "Patton SAMS";
        ebook1.price = 20.50;
        ebook1.size = 3;
        ebook1.pages = 20;
        ebook1.readBook();
        System.out.println("======================");

        Audiobook abook1 = new Audiobook();
        abook1.author = "Carol S.Dweck";
        abook1.price = 23.50;
        abook1.length = 13;
        abook1.narrator = "Irina";
        abook1.listenBook();



    }
}
