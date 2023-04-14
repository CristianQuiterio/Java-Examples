/*
Cristian Quiterio
1/31/22
A00348313
 */
package geometry;

public class Cylinder {
    public static double volume(double r, double h)
    {
        return Math.PI * r * r * h;
    }
    
    public static double surface(double r, double h)
    {
        return (2 * Math.PI * r * h) + (2 * Math.PI * r * r);
    }
}
