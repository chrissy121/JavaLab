package OfficeHours.Practice_06_01_2021;

import java.util.ArrayList;
import java.util.Arrays;

/*
create a class called ScrumTeam

               Attributes:
                            PO, BA, SM,
                            ArrayList<Tester> testersList = new ArrayList<>(),
                            ArrayList<Developer> devopsList = new ArrayList<>(),
                            hasSprint, hasMeeting

                Constructor:
                      sets the names of: PO, BA, SM

                Actions:

                   addTester(Tester tester): adds the given tester to the testers arraylist

                   addTesters(Tester[] testers): adds the given testers to the testers arraylist

                   addDeveloper(Developer developer): adds the given developer to the developers arraylist

                   addDevelopers(Developer[] developers): adds the given developers to the developers arraylist

                   removeTester(long employeeID): removes the given tester from the testers arraylist

                   removeDeveloper(long employeeID): removes the developer from the developers arraylist

                   toString(): prints number of tester,& developers,  PO name, SM name, BA name
 */
public class ScrumTeam {

    String productOwner;
    String businessAnalyst;
    String scrumMaster;
    int sprintNumber;

    ArrayList<Tester> allTesters = new ArrayList<>();
    ArrayList<Developer> allDevelopers = new ArrayList<>();

    public ScrumTeam(String productOwner, String scrumMaster, String businessAnalyst) {
        this.productOwner = productOwner;
        this.scrumMaster = scrumMaster;
        this.businessAnalyst = businessAnalyst;
        this.allDevelopers = new ArrayList<>();
        this.allTesters = new ArrayList<>();

    }

    public void addTester(Tester tester) {
        this.allTesters.add(tester);
    }

    public void addTester(Developer ... developers) { //Tester [] testers
        this.allDevelopers.addAll(Arrays.asList(developers));
    }
    public void addDeveloper(Developer developer) {
        this.allDevelopers.add(developer);
    }

    public void addDeveloper(Developer ... developers) { //Tester [] testers
        this.allDevelopers.addAll(Arrays.asList(developers));
    }

    public boolean removeTester(int employeeID) {
        for (int i = 0; i < allTesters.size(); i++) {
            if (allTesters.get(i).getEmployeeID() == employeeID) {
                allTesters.remove(i);
                return true;
            }
        }

        return false;
    }


     public boolean removeDeveloper (int employeedID) {
        int size = allDevelopers.size();
        allDevelopers.removeIf(eachDev -> eachDev.getEmployeeID() == employeedID);
        return size != allDevelopers.size();
     }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "productOwner='" + productOwner + '\'' +
                ", businessAnalyst='" + businessAnalyst + '\'' +
                ", scrumMaster='" + scrumMaster + '\'' +
                ", sprintNumber=" + sprintNumber +
                ", allTesters=" + allTesters +
                ", allDevelopers=" + allDevelopers +
                ", sprintNumber=" + sprintNumber +
                '}';
    }

    //    public static void main(String[] args) {
//
//        ScrumTeam scrumTeam = new ScrumTeam("Ziba", "John", "Chrissy");
//        System.out.println(scrumTeam.allTesters);
//        Tester tester1 = new Tester("Maxim", 10, "SDET", 1000000);
//        scrumTeam.addTester(tester1);
//        scrumTeam.addTester( new Tester("Anna", 11, "SDET", 1000000));
//        System.out.println(scrumTeam.allTesters);
//
//        scrumTeam.addDeveloper(new Developer("Anton", 1, "Dev", 1000000));
//        System.out.println(scrumTeam.allDevelopers);
//
//    }



}
