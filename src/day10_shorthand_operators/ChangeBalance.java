package day10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {

        double balance = 1200.44;
        System.out.println("balance = " + balance);
        
        double baklava = 22.50;
        System.out.println("baklava = " + baklava);
        balance = balance - baklava;
        System.out.println("balance = " + balance);
        
        double kenafa = 44.45;
        System.out.println("kenafa = " + kenafa);
        balance = balance - kenafa;
        System.out.println("Balance after kenafa = " + balance);

        kenafa = kenafa * 0.4;
        System.out.println("kenafa = " + kenafa);
        balance = balance- kenafa;
        System.out.println("Balance = " + balance);

        double plov = 7.99;
        System.out.println("plov = " + plov);
        balance = balance - plov;
        System.out.println("balance = " + balance);

        double iceTea = 3.0;
        System.out.println("iceTea = " + iceTea);
        balance = balance - 4 * iceTea;
        System.out.println("balance = " + balance);
        
        //return Baklava
        System.out.println("returning baklava= $" + baklava );
        balance = balance + baklava;
        System.out.println("Balance after returning baklava= " + balance);

    }
}
