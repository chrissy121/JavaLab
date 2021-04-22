package OfficeHours.Mine.Array_Practice_2;
import java.util.*;

public class RandomArray {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Your array size?");
    int arraySize = scan.nextInt();

    System.out.println("Your Max number?");
    int maxNum = scan.nextInt();

    Random random = new Random();

    int [] intArray = new int[arraySize];
   for (int i=0; i< arraySize; i++) {

       int randomArray = random.nextInt(maxNum);
       intArray[i] = randomArray;

   }
        System.out.println(Arrays.toString(intArray));

    }
}
