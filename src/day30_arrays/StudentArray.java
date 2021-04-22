package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {

        String[] student1 = new String[5];
        student1[0] = "1234";
        student1[1] = "Bolormaa";
        student1[2] = "Baasanxuu";
        student1[3] = "B22";
        student1[4] = "703-577-9184";

        String[] student2 = {"3421", "Bayarmaa", "Baasanxuu", "B25", "703-5779184" } ;

        System.out.println("student1 id = " + student1[0]);
        System.out.println("student1 firstname = " + student1[1]);
        System.out.println("student1 lastName= " + student1[2]);
        System.out.println("student1 batch number = " + student1[3]);
        System.out.println("student1 PhoneNumber = " + student1[4]);
        System.out.println("====================================");
        System.out.println("student2 id = " + student2[0]);
        System.out.println("student2 firstname = " + student2[1]);
        System.out.println("student2 lastName= " + student2[2]);
        System.out.println("student2 batch number = " + student2[3]);
        System.out.println("student2 PhoneNumber = " + student2[4]);
        System.out.println("================================");

        if (student1.length == 5) {
            System.out.println("Data array has correct length");
        } else {
            System.out.println("Data array has incorrect length");
        }
        if (student1.length == student2.length) {
            System.out.println("PASS: data arrays length match");
        } else {
            System.out.println("FAIL: data array length mismatch");
        }
        String  mobileNum = student1[4];
        System.out.println(student1[1].toUpperCase()+ " " + student1[2].toUpperCase());
        System.out.println(mobileNum.startsWith("703"));
    }
}
