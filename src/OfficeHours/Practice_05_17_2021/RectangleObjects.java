package OfficeHours.Practice_05_17_2021;

public class RectangleObjects {
    public static void main(String[] args) {
        Rectangle myRec = new Rectangle();
        System.out.println(myRec.getArea1());
        myRec.setDimensions1(5, 3);
        System.out.println(myRec);
        System.out.println(myRec.getArea1());


        Rectangle rectangle2 = new Rectangle();
        System.out.println(rectangle2.getArea1());
    }
}
