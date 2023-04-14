/*
Cristian Quiterio
A00348313
2/9/22
*/
package geometricobject;

public class Circle extends GeometricObject 
{
    
    private double radius;

    public Circle()
    {
        super();
        radius = 0;
    }
    
    public Circle(double radius)
    {
        super();
        this.radius = radius;
    }
    
    public Circle(double radius, String color, boolean filled)
    {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() 
    {
        return radius;
    }

    public void setRadius(double radius) 
    {
        this.radius = radius;
    }
    
    public double getArea()
    {
        return Math.PI * radius * radius;
    }
    
    public double getPerimeter()
    {
        return Math.PI * radius * 2;
    }
    
    public double getDiameter()
    {
        return radius * 2;
    }
    @Override
    public String toString()
    {
        return "Circle - R: " + radius + " A: " + Double.toString(getArea()) + " P: " + Double.toString(getPerimeter()) + " " + super.toString();
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if (!(obj instanceof Circle)) return false;
        Circle K = (Circle) obj;
        return ((K.getRadius() == this.radius) && (K.getColor()).equals(super.getColor()) && (super.isFilled() == K.isFilled()));
           
    }
}
