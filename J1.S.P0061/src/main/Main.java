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
    
    public static void main(String[] args) {
        Shape shapes = new Rectangle();
        shapes.input();
        shapes.printResult();
        shapes = new Triangle();
        shapes.input();
        shapes.printResult();
        shapes = new Circle();
        shapes.input();
        shapes.printResult();
    }
}
