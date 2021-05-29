package day47_constructors;

public class StudentObjects {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();

        Student st3 = new Student("Chrissy");
        Student st4 = new Student("Alihan");

        Student st5 = new Student(20);
        Student  st6 = new Student("Alex", 50);
    }
}
