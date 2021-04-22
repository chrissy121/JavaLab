package OfficeHours.Mine;

public class FieldTrip {
    public static void main(String[] args) {
        int grade = 1;
        String location = "";
        int numOfGroup = 0;
        String teacherInCharge = "";
        switch(grade) {
            case 1:
                location = "Apple orchard";
                numOfGroup = 3;
                teacherInCharge ="Ms.Smith";
                break;
            case 2:
                location = "Zoo";
                numOfGroup = 7;
                teacherInCharge ="Mr.Lee";
                break;
            case 3:
                location = "Aquarium";
                numOfGroup = 5;
                teacherInCharge ="Ms.Wilson";
                break;
            case 4:
                location = "Movie theater";
                numOfGroup = 2;
                teacherInCharge ="Ms.Reyes";
                break;
            case 5:
                location = "Museum";
                numOfGroup = 5;
                teacherInCharge ="Ms.Lela";
                break;
            case 6:
                location = "Six Flags";
                numOfGroup = 8;
                teacherInCharge ="Mr.Watt";
                break;
            default:
                break;
        }
        System.out.println("Grade : " + grade);
        System.out.println("Location : " + location);
        System.out.println("Number of groups : " + numOfGroup);
        System.out.println("Teacher in charge : " + teacherInCharge);
    }
}
