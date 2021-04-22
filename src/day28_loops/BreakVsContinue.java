package day28_loops;

public class BreakVsContinue {
    public static void main(String[] args) {
    String[] strArray = {"Booyo", "Uuganaa", "Soko"};

    for (String item: strArray) {
          System.out.println("Family member " + item);
      }

    int[] ints = {1, 2, 3, 6, 123};
    for (int items: ints) {
        if (items % 2 == 0) {
            System.out.println("items: " + items);
         }
       }
        System.out.println("===============================");

    String[] strs = {"Tuul", "Justin", "Puujee", "Miki"};
    for (String items: strs) {
        if (items.contains("i")) {
            System.out.println("Friends " + items);

        }
    }
    String ta = "A";
    ta = ta + "B";
    String tb = "C";
    ta = ta +tb;
    ta = ta.replace("C", "D");
    System.out.println(ta);

    }
}
