package test01_test;

public class LogicAnd {
    public static void main(String[] args) {
        System.out.println(true & true);
        System.out.println(true & false);
        System.out.println(false & true);
        System.out.println(false & false);

        System.out.println(2<4 && 4<6);
        boolean b = 10==10 && false;
        System.out.println(b);

        String drink= "tea";
        boolean hot = true;
        boolean free = true;

        boolean bool = drink.equals("coffee") && hot && free;
        System.out.println("bool = " + bool);

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        bool = drink.equals("tea")||drink.equals("coffee");
        System.out.println("bool = " + bool);




    }
}
