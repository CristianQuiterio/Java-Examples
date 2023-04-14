/*
Cristian Quiterio
1/31/22
A00348313
 */
package geometry;

public class Cube {
    public static double volume(double h)
    {
        return Math.pow(h, 3);
    }
    
    public static double surface(double h)
    {
        return 6 * h * h;
    }
}
