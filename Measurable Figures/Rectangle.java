/**
 *
 * @author Alvin Lin
 * period #3
 *
 */
public class Rectangle implements Measurable{

    private double length;
    private double width;

    /**
     * Constructor setting the length and width of rectangle
     * @param l length of rectangle
     * @param w width of rectangle
     */
    public Rectangle(double l, double w){
        this.length = l;
        this.width = w;
    }

    /**
     * Default Constructor
     */
    public Rectangle() {
    }

    /**
     * Finds perimeter
     * @return perimeter of rectangle
     */
    public double getPerimeter() {
        return (2*width) + (2*length);
    }

    /**
     * Finds Area
     * @return area of rectangle
     */
    public double getArea() {
        return length * width;
    }

    /**
     * toString Method
     * @return toString
     */
    @Override
    public String toString() {
        return "Rectangle: " + "\n" + "length = " + length + "\n" + "width = " + width + "\n" + "perimeter = " + getPerimeter() + "\n" + "area = " + getArea();
    }
    //Your code goes here
}