package day37_methods_overloading;

import java.util.Arrays;

public class OverLoadMain {
    public static void main(String[] args) {
        System.out.println("Hello From Real main");
       main();
        System.out.println(Arrays.toString(args));
    }


    public static void main() {
        System.out.println("Hello overloading main");

    }
}
