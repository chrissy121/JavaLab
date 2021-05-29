package day48_constructors_static;

import java.util.Arrays;
import java.util.Scanner;

import java.util.Scanner;

public class CybertekGroups {
    public static void main(String[] args) {
        Group group1 = new Group("Cyberbugs");  //dependency injection.Group object depends on String name

        //print
        System.out.println(group1.getMembers().size());
        group1.addMember("Berk");
        group1.addMember("Pavel");
        group1.addMember("Elvin");
        group1.addMember("Ali");
        group1.addMember("Chrissy");
        group1.addMember("Maria");

        System.out.println(group1.getMembers().size());
        System.out.println(group1.toString());

        Group group2 = new Group("CyberWomens");
        group2.setMembers(Arrays.asList("Oogii", "Mindy", "Chrissy"));
        //print all members. not toString()
        System.out.println("group2 members = " + group2.getMembers());

        //use if statement to check if Mindy is in group2
        if(group2.getMembers().contains("Mindy")) {
            System.out.println("Mindy is member of group2");
        } else {
            System.out.println("Mindy is NOT member of group2");
        }


        //remove
        group1.removeMember("Pavel");
        group1.removeMember("Elvin");
        System.out.println(group1);
    }
}
