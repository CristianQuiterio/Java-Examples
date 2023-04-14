/*
Cristian Quiterio
A00348313
2/9/22
*/
package geometricobject;
import java.util.Date;

public class GeometricObject 
{
    private String color;
    private boolean filled;
    private Date dateCreated;
    
    public GeometricObject()
    {
        dateCreated = new Date();
        filled = false;
        color = "None";
    }
    
    public GeometricObject(String color, boolean filled)
    {
      dateCreated = new Date();
      this.color = color;
      this.filled = filled;
    }
    
    public String getColor()
    {
        return color;
    }
    
    public void setColor(String color)
    {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String toString()
    {
        return "created on " + dateCreated + " Color: " + color + " Filled: " + filled;
    }    
}
