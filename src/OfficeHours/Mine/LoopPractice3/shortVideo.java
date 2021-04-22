package OfficeHours.Mine.LoopPractice3;

public class shortVideo {
    public static void main(String[] args) {
        for (int r = 0; r < 2; r++) {
            for (int k = 0; k < 3; k++) {
                System.out.print("|Row" + r + "- Column" + k + "|");
            }
            System.out.println();
        }
        System.out.println("========================================");
       // Nested for each loop

       int[] rows = {1, 2, 3, 4};
       int[] cols = {1,2,3};
      for (int row : rows) {
          for (int col : cols) {
              System.out.print("|Row" + row + "-Column" + col);
          }
          System.out.println();
      }

        System.out.println("===================================");



    }
}
