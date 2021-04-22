package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle = "";

        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.length()==0);
        System.out.println(jobTitle.equals(""));
        System.out.println(jobTitle.equalsIgnoreCase(""));

        if (jobTitle.isEmpty()) {
            System.out.println("Job Title is missing, please resend");
        } else {
            System.out.println("Job Title looks good");
        }

        if (jobTitle.length() == 0 ){
            System.out.println("It is Empty");
        } else {
            System.out.println("Good");
        }
        if ("".equals(jobTitle)) {
            System.out.println("Job Title is empty");
        }

        String veggie = "carrots";
        System.out.println(veggie.isEmpty()); //false

        if (!veggie.isEmpty()) {
            System.out.println("Not empty");
        }
        String word2= " ";
        System.out.println(word2.isEmpty());

    }
}
