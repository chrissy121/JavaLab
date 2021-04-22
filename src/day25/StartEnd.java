package day25;
import java.util.Scanner;
public class StartEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter start and end");
        int start = scan.nextInt();
        int end = scan.nextInt();

        if (start > end ) {
            System.out.println("Reverse numbering is not supported");
        }
        for (int i = start; i <= end; i++) {
            if (start <= end) {
                System.out.print(start + " ");
                start++;
            }
        }

    }
}


