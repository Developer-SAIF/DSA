/*
# program to find the factorial of any number entered by the user

steps:
-> run a for loop from 2 to input
-> in each step multiply i with result
*/

import java.util.Scanner;

public class Main 
{
    public static void main (String [] args) 
    {
		    Scanner sc = new Scanner (System.in);
        
        int num = sc.nextInt();
        long result = 1;
        
        for (int i=2; num >= i; i++)
            result = result * i;
        
        System.out.println (result);
	  }
}
