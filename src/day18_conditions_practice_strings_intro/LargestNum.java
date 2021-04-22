package day18_conditions_practice_strings_intro;

public class LargestNum {
    public static void main(String[] args) {
        int num1 = 200;
        int num2 = 23;
        int num3 =440;

    if ( num1 >= num2 && num1 >= num3 ) {
        System.out.println( "Max  = " + num1 );
    }   else  if ( num2 >= num1 && num2 >= num3 ) {
        System.out.println( "Max  = " + num2 );
    } else {
        System.out.println( "Max = " + num3 );
    }
    }
}
