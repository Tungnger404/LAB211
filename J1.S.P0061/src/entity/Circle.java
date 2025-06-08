package entity;

import utils.Validation;

public class Circle extends Shape {

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    /**
     * Calculates and yields the perimeter of the circle.
     *
     * @return Yields the perimeter as a double
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
    /**
     * Calculates and yields the area of the circle.
     *
     * @return Yields the area as a double
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    /**
     * Prints the circle's side lengths, area, and perimeter to the console.
     */
    @Override
    public void printResult() {
        System.out.println("-----Circle-----");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
    
    /**
     * Obtains and validates user input for the circle's side lengths,
     * ensuring they form a valid circle.
     */
    @Override
    public void input() {
        radius = Validation.getDouble("Please input radius of Circle: ", 1,
                Double.MAX_VALUE, messages.Messages.OUT_OF_RANGE, messages.Messages.INVALID);
    }

}
