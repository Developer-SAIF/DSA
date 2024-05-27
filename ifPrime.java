/*
# check if an input is prime or not

steps:
-> handle separately, if input is 1
-> assign a boolean variable ifPrime with true
-> run a for loop, 
-> if input is divisible by (2 to root(input)), then, make ifPrime false & break loop
-> finally print the result
*/

import java.util.*;

public class Main 
{
    public static void main (String args []) 
    {
        Scanner sc = new Scanner (System.in);
        
        int num = sc.nextInt();
        boolean ifPrime = true;
        
        // if input is 1, which is nonprime
        if (num == 1)
            ifPrime = false;
        
        // trying to divide input by 2 to root of input
        for (int i = 2; i*i < num; i++) 
        {
            if ((num % i) == 0) 
            {
                ifPrime = false;
                break;
            }
        }
        
        if (ifPrime) 
            System.out.println ("Prime number");

        else 
            System.out.println ("Composite number");
    }
}
