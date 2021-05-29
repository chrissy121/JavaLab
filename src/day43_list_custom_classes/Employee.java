package day43_list_custom_classes;

public class Employee {
    //instance/object variables
    String name;
    String jobTitle;
    //instance/object method
    public void work(){
        System.out.println(name + " works as " + jobTitle);
    }
}

class Company {
    public static void main(String[] args) {
        Employee person1 = new Employee();
        Employee person2 = new Employee();
        Employee person3 = new Employee();

        person1.name = "Chrissy";
        person1.jobTitle = "Senior SDET";
        person1.work();
        System.out.println(person1.name);
        System.out.println(person1.jobTitle);

        person2.name = "Oogii";
        person2.jobTitle = "Full stack developer";
        person2.work();

        person3.name = "Mindy";
        person3.jobTitle = "Tester";
        person3.work();

        person2=person3;
        person2.work();






    }
}



