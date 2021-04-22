package OfficeHours.Practice_03_02_2021;

public class PersonInfo {
    public static void main(String[] args) {
        String name = " Болормаа ";
        byte age = 42;
        char gender = 'F';
        boolean student = true;
        short numberOfSiblings = 3;
        long favNum = 100;
        int numSeason = 4;
        double birthDate = 10.27;
        int year = 1978;
        //String fullDOB = " 10/27/1978 ";
        //String fullDOB = "" + birthDate + '.' + year;

        String fullDOB = "" + birthDate + '.' + year;

        System.out.println(birthDate + '.');

        String favQuote = "\"Sow your seed in the morning, and at evening\n " +
                           "\t\t\t\t\t\t\t let your hands not be idle, for you do not know which will succeed,\n " +
                           "\t\t\t\t\t\t\t whether this or that, or whether both will do equally well.\" \"Ecclesiastes 11:6\" ";

        System.out.println("What is your name? \t\t\t" + name);
        System.out.println("How old are you?\t\t\t\t" + age);
        System.out.println("Gender? \t\t\t\t\t\t" + gender);
        System.out.println("Are you Cybertek student?\t\t" + student);
        System.out.println("How many Sibling do you have?\t" + numberOfSiblings);
        System.out.println("What is your favorite number?\t" + favNum);
        System.out.println("Number of season in your area?\t" + numSeason);
        System.out.println("Your birth date?\t\t\t\t" + birthDate);
        System.out.println("Year?\t\t\t\t\t\t\t" + year);
        System.out.println("Your full birthday date?\t" + fullDOB);
        System.out.println("Your favorite quote?\t\t" + favQuote);



    }
}
