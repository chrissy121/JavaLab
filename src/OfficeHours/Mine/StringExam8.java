package OfficeHours.Mine;
import java.util.Scanner;

public class StringExam8 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String email = scan.next();

            if (email.contains("_")){

                String str1 = email.substring(0, email.indexOf("_"));
                String str2 = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
                String str3 = email.substring(email.indexOf("@"), email.length()  );
                System.out.print("" + str2 + "_" + str1 + str3);
            } else {
                System.out.print(email);
            }



    }
}
