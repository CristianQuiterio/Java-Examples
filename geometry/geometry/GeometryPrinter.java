/*
Cristian Quiterio
1/31/22
A00348313
*/
package geometry;
import java.util.Scanner;

public class GeometryPrinter {
        public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        double h = 0;
        double r = 0;
        String response = new String();
        
        System.out.println("Please enter the height or 0 if N/A):");
        response = userInput.nextLine();
        h = Double.parseDouble(response);
            
        System.out.println("Please enter the radius or 0 if N/A):");
        response = userInput.nextLine();
        r = Double.parseDouble(response);
        
        System.out.println(String.format("%-10s%-24s%-8s", "Shape", "Surface Area", "Volume"));
        System.out.println(String.format("%-10s%-24s%-8s", "Cube", Cube.surface(h), Cube.volume(h)));
        System.out.println(String.format("%-10s%-24s%-8s", "Sphere", Sphere.surface(r), Sphere.volume(r)));
        System.out.println(String.format("%-10s%-24s%-8s", "Cylinder", Cylinder.surface(r, h), Cylinder.volume(r,h)));
        System.out.println(String.format("%-10s%-24s%-8s", "Cone", Cone.surface(r, h), Cone.volume(r, h)));
}
}