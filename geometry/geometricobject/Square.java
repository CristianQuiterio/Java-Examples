/*
Cristian Quiterio
A00348313
2/23/22
*/
package geometricobject;

public class Square extends GeometricObject implements Colorable, Comparable<Square>
{
    double side;
    
    public Square()
    {
        super();
        side = 0;
    }
    
    public Square(double side)
    {
        this.side = side;
    }
    
    public Square(double side, String color, boolean filled)
    {
        super(color, filled);
        this.side = side;
    }

    public double getSide() 
    {
        return side;
    }

    public void setSide(double side) 
    {
        this.side = side;
    }
    
    @Override
    public String toString()
    {
        return Double.toString(Math.pow(side,2));
    }
    
    @Override
    public String howToColor()
    {
        return "Color all four sides";
    }
    
    @Override
    public int compareTo(Square o)
    {
        if(side <= o.getSide())
        {
            return -1;
        }
        return 1;
    }
}
