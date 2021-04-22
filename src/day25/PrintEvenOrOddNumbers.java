package day25;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {
        int i;
        System.out.println("EVEN NUMBERS 0-100");
        for (i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nODD NUMBERS 0-100");
        for (i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
