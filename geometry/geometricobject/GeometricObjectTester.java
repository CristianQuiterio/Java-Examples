/*
Cristian Quiterio
A00348313
2/9/22
*/
package geometricobject;

public class GeometricObjectTester {

    public static void main(String[] args) {
        
        
        GeometricObject A = new GeometricObject();
        A.setColor("Green");
        A.setFilled(false);
        System.out.println(A);
        // This is testing the functionality of geometric object 2 param constructor and rectangle/circle no param contructors
        /*
        GeometricObject B = new GeometricObject("Red", true);
        System.out.println(B);
        
        Rectangle F = new Rectangle();
        F.setWidth(4);
        F.setHeight(4);
        F.setColor("Black 2.0");
        F.setFilled(true);
        System.out.println(F);
        
        Circle C = new Circle();
        C.setRadius(3);
        C.setColor("Magenta");
        C.setFilled(false);
        System.out.println(C);
        */
        
        Rectangle G = new Rectangle(18.7, .001);
        G.setColor("Hot Pink");
        G.setFilled(false); 
        System.out.println(G);
        
        Rectangle H = new Rectangle(6,12.5, "Lavender", true);
        System.out.println(H);
        
        Circle D = new Circle(5.2);
        D.setColor("Fuschia");
        D.setFilled(true);
        System.out.println(D);
        
        Circle E = new Circle(31.4, "Cerulean", false);
        System.out.println(E);
        
        
        Circle I = new Circle(3, "Starlight Blue", true);
        
        if(E.equals(I))
        {
            System.out.println("The Two circles are equal");
        }
        else
        {
            System.out.println("The Two circles are not equal");
        }
        
        if(E.equals(H))
        {
            System.out.println("The Two circles are equal");
        }
        else
        {
            System.out.println("The Two circles are not equal");
        }
    }
    
}
