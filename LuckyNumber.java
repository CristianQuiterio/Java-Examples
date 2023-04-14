/*
Cristian Quiterio
A00348313
4/15/22
*/

package luckynumber;

public class LuckyNumber {

    public static void main(String[] args) {

        int x = 1234567890;
        int luckynumber = 8;
        
        if(luckyNumber(x,luckynumber))
        {
            System.out.println("Yes! The number " + x + " is lucky!!!");
        }
        else
        {
            System.out.println("Uh-oh! The number " + x + " is not lucky...");
        }
    }
    
    public static boolean luckyNumber(int x, int luckyNumber)
    {
        if (luckyNumber == x/(int)Math.pow(10,(int)Math.log10(x)))
        {
         return true;
        }
        else if(x > 10)
        {
            if(luckyNumber((int)(x%Math.pow(10,(int)Math.log10(x))), luckyNumber)) return true;
        }
        return false;
    }
}
