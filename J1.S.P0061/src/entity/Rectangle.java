package entity;

import utils.Validation;

public class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Calculates and yields the perimeter of the rectangle.
     *
     * @return Yields the perimeter as a double
     */
    @Override
    public double getPerimeter() {
        return (width + length) * 2;
    }

    /**
     * Calculates and yields the area of the rectangle.
     *
     * @return Yields the area as a double
     */
    @Override
    public double getArea() {
        return width * length;
    }

    /**
     * Prints the rectangle's dimensions, area, and perimeter to the console.
     */
    @Override
    public void printResult() {
        System.out.println("-----Rectangle-----");
        System.out.println("Width: " + width);
        System.out.println("Length: " + length);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());

    }

    /**
     * Obtains and validates user input for the rectangle's width and length,
     * ensuring valid positive values.
     */
    @Override
    public void input() {
        width = Validation.getDouble("Please input side width of Rectangle: ", 1, Double.MAX_VALUE,
                messages.Messages.OUT_OF_RANGE, messages.Messages.INVALID);
        length = Validation.getDouble("Please input length of Rectangle: ", 1, Double.MAX_VALUE,
                messages.Messages.OUT_OF_RANGE, messages.Messages.INVALID);
    }

}
