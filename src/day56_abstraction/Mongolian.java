package day56_abstraction;

public class Mongolian implements Greeting{
    @Override
    public void hi() {
        System.out.println("Сайн уу");
    }

    @Override
    public void bye() {
        System.out.println("Баяртай");
    }
}
