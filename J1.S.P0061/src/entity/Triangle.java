package entity;

import utils.Validation;

public class Triangle extends Shape {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    /**
     * Calculates and yields the perimeter of the triangle.
     *
     * @return Yields the perimeter as a double
     */
    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    /**
     * Calculates and yields the area of the triangle using Heron's formula.
     *
     * @return Yields the area as a double
     */
    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }
  
    /**
     * Prints the triangle's side lengths, area, and perimeter to the console.
     */
    @Override
    public void printResult() {
        System.out.println("-----Triangle-----");
        System.out.println("Side A: " + sideA);
        System.out.println("Side B: " + sideB);
        System.out.println("Side C: " + sideC);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }

    /**
     * Obtains and validates user input for the triangle's side lengths,
     * ensuring they form a valid triangle.
     */
    @Override
    public void input() {
        while (true) {
            sideA = Validation.getDouble("Please input side A of Triangle: ", 1, Double.MAX_VALUE,
                    messages.Messages.OUT_OF_RANGE, messages.Messages.INVALID);
            sideB = Validation.getDouble("Please input side B of Triangle: ", 1,
                    Double.MAX_VALUE, messages.Messages.OUT_OF_RANGE, messages.Messages.INVALID);
            sideC = Validation.getDouble("Please input side C of Triangle: ", 1,
                    Double.MAX_VALUE, messages.Messages.OUT_OF_RANGE, messages.Messages.INVALID);

            if (sideA + sideB > sideC && sideB + sideC > sideA && sideA + sideC > sideB) {
                return;
            } else {
                System.out.println("Input triangle not valid. Enter agian: ");
            }
        }
    }
}
