package day29_nestedloop_arrays;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i<=10; i++) {
            for (int j=1; j<=10; j++) {
                System.out.print(i*j+ "\t ");
            }
            System.out.println();
        }
        System.out.println("===============================");
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <=4; col++) {
                System.out.println(row + " | " + col);
            }
        }
        System.out.println();


    }
}
