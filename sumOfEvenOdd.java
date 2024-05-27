/*
# a program that reads a set of integers, and then prints the sum of the
even and odd integers.

steps:
-> create a int variable query for sentinal controled while loop
-> create 2 int variable to store even and odd number sum
-> run while loop unlit user quits
-> if input is even, add it to the sum of even numbers
-> else, add it to the sum of odd numbers
-> finally print result
*/

import java.util.Scanner;

public class Main 
{
    public static void main (String [] args) 	
    {
		Scanner sc = new Scanner (System.in);
        
		int sumeven = 0;
		int sumodd = 0;
		int query = 1;
        
		while (query == 1) 
		{
			int number = sc.nextInt();
            
			if (number % 2 == 0)
			    sumeven += number;
			
			else
			    sumodd += number;
            
			System.out.print ("Type 1 to continue: ");
			query = sc.nextInt();
        }
        
		System.out.println ("Even sum: " + sumeven);
		System.out.println ("Odd sum: " + sumodd);
	}
}
