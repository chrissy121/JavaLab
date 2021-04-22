package OfficeHours.String_Practice2;
import java.util.Scanner;
public class BreadWithBread {

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String str = scan.next();

            int b1 = str.indexOf("bread");
            if (b1 != -1) {
                int b2 = str.lastIndexOf("bread");
                if (b1 < b2 ) {
                    String sandwich = str.substring(b1 + 5, b2);
                    System.out.println(sandwich);
                } else {
                    System.out.println("nothing");
                }
            } else {
                System.out.println("nothing");
            }

    }
}
