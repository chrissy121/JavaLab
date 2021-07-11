package day61_exceptions;

public class ElementaryStudentTest {
    public static void main(String[] args) {
        try {
            ElementaryStudent el1 = new ElementaryStudent();
            el1.setName("Bob");
            el1.setAge(13);
            System.out.println(el1.toString());
        } catch (Exception e) {
            e.printStackTrace(); //print the error stack trace and continue. does not stop code
        }

        System.out.println("---EXECUTION COMPLETED---");
    }
}
