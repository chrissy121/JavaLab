package day25;

public class PrintStars {
    public static void main(String[] args) {

        for (int stars = 10 ; stars <= 15; stars++) {
            System.out.print("✯ ");
        }
        System.out.println();


        String myStars = "";
        for (int stars = 1; stars<=15; stars++ ) {
            myStars += "\uD83C\uDF1F ";
            System.out.println("my stars = " + myStars.trim());

        }

    }
}
