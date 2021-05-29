package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {

        CheckingAccount myAccount = new CheckingAccount();
        myAccount.setAccountNumber(12345678867885L);
        myAccount.setAccountHolder("Mike");
        myAccount.setType("360 version");


        System.out.println("myAccount = " + myAccount);
    }
}
