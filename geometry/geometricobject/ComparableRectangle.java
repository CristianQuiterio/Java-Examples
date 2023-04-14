/*
Cristian Quiterio
A00348313
2/9/22
*/
package geometricobject;

public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle>
{
    public ComparableRectangle(double width, double height)
    {
        super(width, height);
    }
    
    public int compareTo(ComparableRectangle o) {
        if (getArea() > o.getArea()) {
            return 1;
        } else if (getArea() < o.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }
    
    public String toString()
    {
        return super.toString() + "Area: " + getArea();
    }


}
