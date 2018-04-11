/**
 *
 * @author Alvin Lin
 * period #3
 *
 */
public class SingingRectangle extends Rectangle{

    /**
     * Constructor calling Rectangle()
     * @param l length of Rectangle
     * @param w wodtj pf Rectamg;e
     */
    public SingingRectangle(double l, double w){
        super(l,w);
    }

    /**
     * toString Method
     * @return toString
     */
    @Override
    public String toString() {
        return super.toString() + "\n" + "Rectangle song: " + "\n" + "I'm a rectangle." + "\n" + "You can see." + "\n" + "I have four sides." + "\n" + "Count with me" + "\n" + "2 are short and 2 are long." + "\n" + "Come along and sing my song.";
    }


}