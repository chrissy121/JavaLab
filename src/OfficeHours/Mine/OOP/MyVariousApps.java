package OfficeHours.Mine.OOP;

public class MyVariousApps {
    public static void main(String[] args) {
        MyApplication crypto = new MyApplication();
        crypto.name = "CoinBase";
        crypto.version = 9.75;
        crypto.size = 35.67;

        crypto.call();

        MyApplication sport = new MyApplication();
        sport.name = "Football";
        sport.version = 2021.5;
        sport.size = 2.3;

        sport.call();
        System.out.println(MyApplication.numbers(3.5, 5.6));

    }

}
