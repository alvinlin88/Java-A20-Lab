/**
 *
 * @author Alvin Lin
 * period #3
 *
 */

/**
 * Circle Class with a circle object
 */
public class Circle implements Measurable{

    private double radius;

    /**
     * Constructor setting the radius
     * @param radius radius of circle
     */
    public Circle(double radius){
        this.radius = radius;
    }

    /**
     * Returns perimeter
     * @return perimeter of circle
     */
    public double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    /**
     * Returns Area
     * @return area of circle
     */
    public double getArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    /**
     * toString method
     * @return toString
     */
    @Override
    public String toString() {

        return "Circle: " + "\n" + "radius = " + radius + "\n" + "circumference = " + getPerimeter() + "\n" + "area = " + getArea();

    }
}