package day50_inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Bakyt";
        person1.age = 21;

        person1.talk();
        person1.walk();
        person1.work("SDET");

        Teacher teacher1 = new Teacher();
        teacher1.teacherID=1234;
        teacher1.name = "Saim";
        teacher1.age = 30;
        teacher1.walk();
        teacher1.talk();
        teacher1.teach("Java");

        Student st1 = new Student();
        st1.name = "Nara";
        st1.age = 20;
        st1.schoolName = "Cybertek";
        st1.studentID = "1234";
        st1.walk();
        st1.talk();
        st1.study("java");
        st1.work("Java programmer");

    }
}
