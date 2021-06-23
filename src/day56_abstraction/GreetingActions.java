package day56_abstraction;

public class GreetingActions {
    public static void main(String[] args) {
        Mongolian mongolian = new Mongolian();
        mongolian.hi();
        mongolian.bye();

        Greeting gt = new Mongolian();
        gt.hi();
        gt.bye();

        Japanese japanese = new Japanese();
        japanese.hi();
        japanese.bye();

        gt = new Japanese();
        gt.hi();
        gt.bye();

    }
}
