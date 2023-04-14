/*
Cristian Quiterio
A00348313
3/16/22
 */
package inputoutputdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputOutputDemo {

    public static void main(String[] args) throws FileNotFoundException {
        // C:\Users\Cristian\Documents\NetBeansProjects\InputOutputDemo\src\inputoutputdemo
        File inputFile = new File("C:\\Users\\Cristian\\Documents\\NetBeansProjects\\InputOutputDemo\\src\\inputoutputdemo\\input.txt");
        Scanner in = new Scanner(inputFile);
        PrintWriter out = new PrintWriter("C:\\Users\\Cristian\\Documents\\NetBeansProjects\\InputOutputDemo\\src\\inputoutputdemo\\out.txt");
        //in.useDelimiter("[^A-za-z]+");
        //in.useDelimiter("");
        while(in.hasNext())
        {
            String number = in.nextLine();
            //char number = in.next().charAt(0);
            System.out.println(number);
            out.print(number);
            out.print("\n");
        }
        in.close();
        out.close();
    }
    
}
