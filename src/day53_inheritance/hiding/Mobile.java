package day53_inheritance.hiding;

public class Mobile extends Phone{
    String type = "Mobile phone";

    //Method hidden..

    public static void use() {
        System.out.println("Using mobile phone");
    }
    @Override
    public void call() {
        use();
        System.out.println("and calling on mobile");
    }

    public void texting() {
        use();
        System.out.println("Using text message");
    }
}
