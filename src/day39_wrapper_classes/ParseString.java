package day39_wrapper_classes;

public class ParseString {
    public static void main(String[] args) {
        String total = "345";
        int count = Integer.parseInt(total);
        System.out.println(count+5);
        String strPrice = "123.5";
        double dPrice = Double.parseDouble(strPrice);
        if (dPrice > 100) {
            System.out.println("yes it is more than $100");
        }

        String sentence = "I wrote 100 lines of code";
       // int  linesOfCove = Integer.parseInt(sentence.split(" ").[2]);

        String[] arr = sentence.split(" ");
        int linesOfCode = Integer.parseInt(arr[2]);
        System.out.println(linesOfCode);
    }

}
