package OfficeHours.Video;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Chrissy", 25);
        p1.setAge(27);
        p1.setName("Adam");
        System.out.println(p1.getName()+p1.getAge());
    }
}
