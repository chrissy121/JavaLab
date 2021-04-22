package test01_test;
import java.util.Scanner;

public class Chen {
    public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);

            //DO NOT CHANGE ABOVE CODE!  Write your code below
            System.out.print("input: ");
            String name = inp.nextLine();

            String name1="Chen";
            if(name.equals(name1)){
                System.out.println("Output:" + " Teacher");
            }else{
                System.out.print("Output:" + " student");
            }
        }

}
