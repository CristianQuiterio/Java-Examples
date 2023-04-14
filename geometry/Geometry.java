/*
Cristian Quiterio
1/31/22
A00348313
 */
package geometry;

public class Geometry {

    public static double cubeVolume(double h)
    {
        return Math.pow(h, 3);
    }
    public static double cubeSurface(double h)
    {
        return 6 * h * h;
    }
    
    public static double sphereVolume(double r)
    {
        return (4 * Math.PI * Math.pow(r, 3))/3;
    }
    
    public static double sphereSurface(double r)
    {
        return 4 * Math.PI * r * r;
    }
    
    public static double cylinderVolume(double r, double h)
    {
        return Math.PI * r * r * h;
    }
    
    public static double cylinderSurface(double r, double h)
    {
        return (2 * Math.PI * r * h) + (2 * Math.PI * r * r);
    }
    
    public static double coneVolume(double r, double h)
    {
        return (Math.PI * r * r * h)/3;
    }
    
    public static double coneSurface(double r, double h)
    {
     return Math.PI * r * (r + Math.sqrt((h*h) + (r * r)));
    }
    
}
