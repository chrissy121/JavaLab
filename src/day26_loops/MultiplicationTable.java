package day26_loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        int n = 3;
        if (n < 1 || n > 10) {
            System.out.println("ERROR: Invalid");
            return;
        }

        for (int i = 1; i <= 10; i++) {
                System.out.println(i + " x " + n + " = " + i * n);
            }

    }
}
