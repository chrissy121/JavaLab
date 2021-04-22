package OfficeHours.Practice_03_08_2021;

public class CastingPractice {
    public static void main(String[] args) {

        byte b = 10;
        short s = b;
        byte b2 = (byte)s;

        double d= 5.3;
        int i = (short)d;
        int i2 = (int)d;

        float f = 3.54f;
        float f2 = (float)3.54;

        float f3 = 5; // float = int->5.0
        float f4 = 5.5F; // float = double
        long l = 22313;  //long = int
        long l3 = 4456677788L;

        System.out.println((double)l);
        System.out.println((float)l);

        double million = 1_000_000;
        System.out.println(million);
        long l2 = 3344566778788L;
        System.out.println(l2);



    }
}
