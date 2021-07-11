package day61_exceptions.errors;

public class ErrorExamples {
    public static void main(String[] args) {
        //StackOverError
        myMethod();

    }

    static int counter = 0;

    public static void myMethod() {
        System.out.println(counter++);
        myMethod();
    }


}
