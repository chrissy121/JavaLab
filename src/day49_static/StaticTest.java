package day49_static;

public class StaticTest {
    public static void main(String[] args) {
        //1. Ststic method can be called using classname
        StaticMethods.displayMessage("hello");

        //1. instance method needs an object to be called
        //StaticMethods.instanceMethod(); ERROR
        StaticMethods stm = new StaticMethods();
        stm.instanceMethod();
    }
}
