package test01_test;

public class PrePostIncrementDecrement {
    public static void main(String[] args) {
        int apple = 29;
        double basket = ++apple / 6 * apple-- + apple;

        System.out.println( basket );
        System.out.println(apple);

    }
}
