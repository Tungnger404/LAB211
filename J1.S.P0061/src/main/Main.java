package main;

import entity.Circle;
import entity.Rectangle;
import entity.Shape;
import entity.Triangle;

/**
 * Manages the creation and display of geometric shapes, including rectangles,
 * circles, and triangles, based on user input.
 *
 * @author lenovo
 */
public class Main { 

    /**
     * Creates and obtains user input for a Rectangle, yielding the configured
     * shape.
     *
     * @return Yields a Rectangle with validated user-provided dimensions
     */
    private static Shape inputRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.input();
        return rectangle;
    }

    /**
     * Creates and obtains user input for a Circle, yielding the configured
     * shape.
     *
     * @return Yields a Circle with a validated user-provided radius
     */
    private static Shape inputCircle() {
        Circle circle = new Circle();
        circle.input();
        return circle;
    }

    /**
     * Creates and obtains user input for a Triangle, yielding the configured
     * shape.
     *
     * @return Yields a Triangle with validated user-provided side lengths
     */
    private static Shape inputTriangle() {
        Triangle triangle = new Triangle();
        triangle.input();
        return triangle;
    }

    /**
     * Displays the properties, area, and perimeter of the given triangle,
     * rectangle, and circle to the console.
     *
     * @param triangle  Specifies the Triangle to display
     * @param rectangle Specifies the Rectangle to display
     * @param circle    Specifies the Circle to display
     */
    private static void display(Shape trigle, Shape rectangle, Shape circle) {
        rectangle.printResult();
        circle.printResult();
        trigle.printResult();
    }

    public static void main(String[] args) {
        Shape rectangle = inputRectangle();
        Shape circle = inputCircle();
        Shape trigle = inputTriangle();

        display(trigle, rectangle, circle);
    }
}
