/*
Cristian Quiterio
A00348313
2/9/22
*/
package geometricobject;

public class Rectangle extends GeometricObject
{

    private double width;
    private double height;
    
    public Rectangle() 
    {
        super();
        width = 0;
        height = 0;
    }
    
    public Rectangle(double width, double height) 
    {
        super();
        this.width = width;
        this.height = height;
    }
        
    public Rectangle(double width, double height, String color, boolean filled) 
    {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() 
    {
        return width;
    }

    public void setWidth(double width) 
    {
        this.width = width;
    }

    public double getHeight() 
    {
        return height;
    }

    public void setHeight(double height) 
    {
        this.height = height;
    }
    
    public double getArea()
    {
        return width * height;
    }
    
    public double getPerimeter()
    {
        return (2 * width) + (2 * height); 
    }
    @Override
    public String toString()
    {
        return "Rectangle - W: " + width + " H:" + height + " A: " + Double.toString(getArea()) + " P: " + Double.toString(getPerimeter()) + " " + super.toString();
    }
}