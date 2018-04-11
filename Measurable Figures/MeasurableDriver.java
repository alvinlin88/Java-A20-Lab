import java.util.ArrayList;
/**
 *
 * @author Your name
 * period #
 *
 */

public class MeasurableDriver {

    /**
     * Main method
     * @param args default parameter
     */
    public static void main(String[] args) {

        ArrayList<Measurable> object = new ArrayList<Measurable>();
        object.add(new Circle(1.0));
        object.add(new Rectangle(1.0, 1.0));
        object.add(new Triangle(3.0, 4.0, 5.0));
        object.add(new SingingRectangle(2.0, 2.0));

        object.add(new Circle(1.5));
        object.add(new Rectangle(1.0, 1.5));
        object.add(new Triangle(7.0, 24.0, 25.0));

        object.add(new Circle(2.0));
        object.add(new Rectangle(2.0, 3.0));
        object.add(new Triangle(11.0, 60.0, 61.0));

        for (Measurable x: object ) {
            System.out.println(x.toString());
            System.out.println();
        }
    }

}