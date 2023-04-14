/*
Cristian Quiterio
A00348313
3/23/22
*/
package parityfinder;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ParityFinder {

    public static void main(String[] args) throws FileNotFoundException {
        
        File inputFile = new File("input.txt");
        Scanner in = new Scanner(inputFile);
        PrintWriter out = new PrintWriter("NumberParity.txt");
        String nextWord;
        int number;
        while(in.hasNext())
        {
            nextWord = in.next();
            try
            {
                number = Integer.parseInt(nextWord);
            
                if (0 == number%2)
                {    
                    out.print(number + " is Even.");
                    out.print("\n");
                    System.out.println("Found " + number + " to be Even.");
                }
                else if (1 == number%2 || -1 == number%2)
                {
                    out.print(number + " is Odd.");
                    out.print("\n");
                    System.out.println("Found " + number + " to be Odd.");                
                }
            }
            catch(NumberFormatException nfe)
            {
                System.out.println(nextWord + " does not have a parity.");
            }
        }
        
        in.close();
        out.close();
        
