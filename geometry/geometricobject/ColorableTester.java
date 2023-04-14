/*
Cristian Quiterio
A00348313
2/23/22
*/
package geometricobject;
import java.util.Arrays;

public class ColorableTester {
    public static void main(String[] args) {
        
        GeometricObject[] shapes = new GeometricObject[6];
        
        shapes[0] = new Circle(5.2);
        shapes[0].setColor("Fuschia");
        shapes[0].setFilled(true);
        
        shapes[1] = new Circle(31.4, "Cerulean", false);
        
        shapes[2] = new Rectangle(18.7, .001);
        shapes[2].setColor("Hot Pink");
        shapes[2].setFilled(false); 

        shapes[3] = new Rectangle(6,12.5, "Lavender", true);

        shapes[4] = new Square(2);
        shapes[5] = new Square(4.5, "Cyan", true);

        for(GeometricObject i: shapes)
        {
            System.out.println(i);
            if (i instanceof Colorable)
            {
               System.out.println(((Colorable)i).howToColor());
            }
        }
        
        Square[] squares = new Square[6];
        
        squares[0] = new Square(2);
        squares[1] = new Square(64);
        squares[2] = new Square(32);
        squares[3] = new Square(16);
        squares[4] = new Square(8);
        squares[5] = new Square(4);
        
        Arrays.sort(squares);
        
        for(Square i: squares)
        {
            System.out.println(i);
        }
        
        
        
    }
    
}
