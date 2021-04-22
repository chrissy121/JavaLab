package day36_methods_with_return;
import java.util.*;

public class Info {
    public static void main(String[] args) {
        fullName();
        System.out.println("Full name = " + fullName());
        System.out.println(isMarried());
        System.out.println(getAges());
        System.out.println("Random year = " + getRandomYear());


        String name = fullName();
        boolean married = isMarried();
        int age = getAges();
        int year = getRandomYear();

        System.out.println("name = " + name);
        System.out.println("married = " + married);

    }

    public static String fullName() {
        System.out.println("inside fullName method");
        return "Mike Smith";
    }

    public static boolean isMarried() {
       return true;
    }
    public static int getAges() {
        return 42;
    }

    public static int getRandomYear() {
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }

}
