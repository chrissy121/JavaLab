package day05_primitives_concatanation;

public class JobInfo {
    public static void main(String[] args){
        String title = "Java SDET";
        String company = "Palo Alto Networks";
        String jobDescription = "Experience in Java, Selenium, Cucumber, Tomato, JUnit";
        double salary = 150000.0;
        byte yearsExp = 5;
        boolean hasBenefits = true;

        System.out.println("Job Title is: " + title);
        System.out.println("Company: " + company);
        System.out.println("Job description: " + jobDescription);
        System.out.println("Salary: $" + salary);
        System.out.println("Years of experience: " + yearsExp);
        System.out.println("Has benefits? " + hasBenefits);

    }
}
