/*
Cristian Quiterio
1/31/22
A00348313
 */
package geometry;

public class Cone {
    public static double volume(double r, double h)
    {
        return (Math.PI * r * r * h)/3;
    }
    
    public static double surface(double r, double h)
    {
     return Math.PI * r * (r + Math.sqrt((h*h) + (r * r)));
    }
}
