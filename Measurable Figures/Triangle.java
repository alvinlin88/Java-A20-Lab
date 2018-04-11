/**
 *
 * @author Alvin Lin
 * period #3
 *
 */
public class Triangle implements Measurable{

    private double side1;
    private double side2;
    private double side3;

    /**
     * Constructor setting the 3 sides of the triangle
     * @param s1 side 1 of triangle
     * @param s2 side 2 of triangle
     * @param s3 side 3 of triangle
     */
    public Triangle(double s1, double s2, double s3){
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }

    /**
     * Finds perimeter of triangle
     * @return perimeter of triangle
     */
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    /**
     * Finds Area of triangle
     * @return area of triangle
     */
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }


    /**
     * toString Method
     * @return toString
     */
    @Override
    public String toString() {
        return "Triangle: " + "\n" + "side1 = " + side1 + "\n" + "side2 = " + side2 + "\n" + "side3 = " + side3 + "\n" + "perimeter = " + getPerimeter() + "\n" + "area = " + getArea();

    }
}