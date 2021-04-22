package test01_test;

public class Quize {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 6;
        int iter = 5;

        int total = 0;

        for (int j = 0; j < 5; j++) {
            if (j % 3 == 0) continue;
            total += num1 + num2;

        }

        int count = 0;
        for ( int a = 0; a < 4; a++) {
            if (a == 3) continue;
            for (int b = a + 1; b < 5; b++) {
                count++;
                if (b == 3) break;
            }
        }
        System.out.println(count);

        int[] rows = {1,2,3,4};
        int[] cols = {1,2,3};

        for (int row : rows) {
            for (int col : cols) {
                System.out.print(" |Row" + row + "-Column" + col);
            }
            System.out.println();
        }
        System.out.println("================================");
    int i = 0;
    while (i<5) {
        i++;
        int j=0;
        while (j<3) {
            j++;
            System.out.print("|Row" + i + "Column" + j);
        }
        System.out.println();
    }
        System.out.println("===================================" );
    int i1 = 0;
    do {
        i1++;
        int j = 0;
        do {
            j++;
            System.out.print("|Row" + i1 + " Column" + j);
        } while (j<3);
        System.out.println();
    } while (i1 < 5);





    }
}

