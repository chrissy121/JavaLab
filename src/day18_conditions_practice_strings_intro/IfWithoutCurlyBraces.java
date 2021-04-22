package day18_conditions_practice_strings_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
        String todaysClass = "python";
        int i=3;

        if (i==1)
            System.out.println("a is 1");
            System.out.println("1 is a");

        if (todaysClass.equals("java"))
            System.out.println("java is fun");


        else
            System.out.println("is not java " + todaysClass);


    }
}
