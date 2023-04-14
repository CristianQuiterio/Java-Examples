/*
Cristian Quiterio
A00348313
3/23/22
*/

package quadraticequationsolver;
import java.util.Scanner;

public class QuadraticEquationSolver {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String response;
        
        double a;
        double b;
        double c;  
        double ans1;
        double ans2;
        
        boolean notDone = true;
        boolean valid;
        
        while(notDone)
        {
        System.out.println("Enter the value of A:");
        response = userInput.nextLine();
        a = Double.parseDouble(response);
        userInput.reset();
        System.out.println("Enter the value of B:");
        response = userInput.nextLine();
        b = Double.parseDouble(response);
        userInput.reset();
        System.out.println("Enter the value of C:");
        response = userInput.nextLine();
        c = Double.parseDouble(response);
        
        try
        {
            if(a == 0) throw new DivisionByZero("Cannot Divide By Zero");
            ans1 = Math.pow(b,2) - 4*a*c;
            if (ans1 < 0) throw new NanException("No square root for negative numbers make sure that b^2 is greater than 4*a*c");
            ans2 = (-b - Math.sqrt(ans1)) / 2 * a;
            ans1 = (-b + Math.sqrt(ans1)) / 2 * a;
            System.out.println("x = " + ans1 + " or \n" + "x = " + ans2);
        }
        catch(DivisionByZero dbz)
        {
            System.out.println(dbz.getMessage());
        }
        catch(NanException ne)
        {
            System.out.println(ne.getMessage());
        }
        
        valid = true;
        while(valid)
        {
        System.out.println("Would you like to solve another quadratic equation?");
        response = userInput.nextLine();
        if(response.equals("N") || response.equals("n"))
        {
            notDone = false;
            valid = false;
        }
        else if (response.equals("Y") || response.equals("y"))
        {
            valid = false;
        }
        else
        {
            System.out.println("Please enter a valid response. (Y/y/N/n)");
        }
        }
        }   
    }  
}