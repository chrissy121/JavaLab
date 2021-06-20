package test01_test;

public class BasePerson {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.talk();
        System.out.println("===================");

        Student student = new Student();
        student.talk();
    }
}
