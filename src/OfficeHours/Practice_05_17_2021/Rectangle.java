package OfficeHours.Practice_05_17_2021;

public class Rectangle {

    // java package mandatory
    // imports mandatory
    // class name always math java file name
    double height;
    double width;
    double area;

    public void setDimensions1(double recHeight, double recWidth) {
        height = recHeight;
        width = recWidth;
        area = height * width;
    }

    public double getArea1() {
        return area;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                " height=" + height +
                ", width=" + width +
                ", area=" + area +
                '}';
    }
}
