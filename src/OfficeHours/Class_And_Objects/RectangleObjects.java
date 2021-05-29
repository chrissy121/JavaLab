package OfficeHours.Class_And_Objects;

public class RectangleObjects {
    public static void main(String[] args) {
        Rectangle myRectangleObject = new Rectangle();

        myRectangleObject.setDimensions(23.5, 12.4);

        System.out.println("myRectangleObject = " + myRectangleObject);

        System.out.println(myRectangleObject.getArea());


    }
}
