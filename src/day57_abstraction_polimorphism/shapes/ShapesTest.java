package day57_abstraction_polimorphism.shapes;

import day57_abstraction_polimorphism.polymorphism.Animal;

import java.util.ArrayList;
import java.util.List;

public class ShapesTest {
    public static void main(String[] args) {

        Shape triangle = new Triangle();
        triangle.draw();

        Shape circle = new Circle();
        circle.draw();

        Shape square = new Square();
        square.draw();

        Shape shape = new Triangle();
        shape.draw();

        shape = new Circle();
        shape.draw();

        shape = new Square();
        shape.draw();

        /*
        loop and list
         */

        List<Shape> shapes = new ArrayList<>();
        shapes.add(triangle);
        shapes.add(new Triangle());
        shapes.add(new Square());
        shapes.add(new Square());
        shapes.add(new Circle());
        shapes.add(new Circle());

        //System.out.println(shapes);
        for (Shape eachShape : shapes) {
            eachShape.draw();
        }

        drawShape(new Circle());
        drawShape(new Square());

    }
    /*
    Static method: drawShape
    accepts object of shape
    then calls draw() method
     */

    public static void drawShape(Circle shape) {
        System.out.println("----Drawing shape-----");
        shape.draw();

    }
    public static void drawShape(Square shape) {
        System.out.println("----Drawing shape-----");
        shape.draw();

    }
}
