package entity;

/**
 * Represents an abstract shape with methods to calculate its perimeter and
 * area, print results, and obtain input values.
 *
 */
public abstract class Shape {

    /**
     * Calculates and yields the perimeter of the shape.
     *
     * @return The perimeter as a double value
     */
    public abstract double getPerimeter();

    /**
     * Calculates and yields the area of the shape.
     *
     * @return The area as a double value
     */
    public abstract double getArea();

    /**
     * Prints the shape's properties and calculated results to the console.
     */
    public abstract void printResult();

    /**
     * Obtains input values for the shape's properties from the user.
     */
    public abstract void input();

}
