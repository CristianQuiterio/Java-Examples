/*
Cristian Quiterio
1/31/22
A00348313
 */
package geometry;

public class Sphere {
    public static double volume(double r)
    {
        return (4 * Math.PI * Math.pow(r, 3))/3;
    }
    
    public static double surface(double r)
    {
        return 4 * Math.PI * r * r;
    }
}
