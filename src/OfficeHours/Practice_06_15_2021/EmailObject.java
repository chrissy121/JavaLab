package OfficeHours.Practice_06_15_2021;

public class EmailObject {
    public static void main(String[] args) {

        Email  email = new Email("bolor@cybertek.com", 34);
        //email.ADDRESS = "email"
        System.out.println(email);

        Gmail gmail = new Gmail("crys121@gmail.com" , 134);
        System.out.println(gmail);

        Yahoo yahoo = new Yahoo("bolor@yahoo.com", 3);
        System.out.println(yahoo);

        System.out.println(Email.domain);
        System.out.println(Gmail.domain);
        System.out.println(Yahoo.domain);
        System.out.println(Email.domain);


        Email.sendEmail();
        Gmail.sendEmail();

    }
}
