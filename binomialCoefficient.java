/*
# program to find the binomial coefficent

steps:
-> call a binomial coefficient calculating function
-> for calculation, the function will call a factorial calculating function several times
-> at the end, print out the returned result
*/

import java.util.Scanner;

public class Main 
{
    public static long factorial (int num) 
    {
        long result_1 = 1;
        
        for (int i = num; i >= 1; i--) 
        {
            result_1 = result_1 * i;
        }
        
        return result_1;
    }

    public static long binomialco (int n, int r) 
    {
        long result_2 = factorial (n) / (factorial (r) * factorial (n-r));
        return result_2;
    }

    public static void main (String [] args) 
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.print ("n: ");
        int n = sc.nextInt();
        
        System.out.print ("r: ");
        int r = sc.nextInt();
        
        System.out.println ("nCr = " + binomialco (n,r));
    }
}
