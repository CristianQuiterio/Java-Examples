/*
Cristian Quiterio
A00348313
4/15/22
*/

package recursiveexponent;

public class RecursiveExponent {

    public static void main(String[] args) {
        
        int x = 3;
        int n = 5;
        
        System.out.println(x + "^" + n + "=" + recursiveExponent(x,n));
    }
    
    public static int recursiveExponent(int x, int n)
    {
        if (n > 0)
        {
            return recursiveExponent(x, n - 1) * x;
        } 
        else        
        {
            //x^0 = 1
            return 1;
        }
    }
    
}
