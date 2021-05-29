package OfficeHours.Class_And_Objects;

public class Rectangle {
    double width;
    double height;
    double area;


    public void setDimensions(double width1, double height1) {
        width = width1;
        height = height1;
        area = width * height;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", area=" + area +
                '}';
    }
    public int getArea() {
        return (int)area;
    }

}
