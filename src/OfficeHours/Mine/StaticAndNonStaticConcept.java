package OfficeHours.Mine;

public class StaticAndNonStaticConcept  {
    String name = "Tom"; //non static global
    static int age = 25;

    public static void main(String[] args) {

        //how to call static method and vars?
        //1. direct calling:
        sum();
        //2. calling by classname;
        StaticAndNonStaticConcept.sum();
        System.out.println(age);
        System.out.println(StaticAndNonStaticConcept.age);

        //=====================================
        //how to call non static methods and vars?

        StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
        obj.sendMail();
        System.out.println(obj.name);








    }

    public void sendMail() {
        System.out.println("send mail method");
    }

    public static void sum() {
        System.out.println("sum method");
    }

}
