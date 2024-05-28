/*
# print all the primes in a range

steps:
-> calls primeInRange function with the last range value
-> which calls isPrime function for each of 2 to last value
-> if isPrime returns true, then it prints the value
-> isPrime tries to divide its input with values 2 to root(input)
-> it returns false if it suceeds, unless returns true
*/

import java.util.Scanner;

public class Main 
{
    public static boolean isPrime (int num) 
    {
        if (num == 2)
            return true;
        
        for (int i = 2; i*i <= num; i++) 
            if (num%i == 0) 
                return false;
        
        return true;
    }

    public static void primeInRange (int num) 
    {
        if (num < 2) 
            System.out.println ("Invalid input.");
        
        for (int i = 2; i <= num; i++) 
            if (isPrime (i))
                System.out.print (i + " ");
    }

    public static void main (String [] args) 
    {
        Scanner sc = new Scanner (System.in);

        System.out.print ("Find prime numbers, from 2 to : ");
        int num = sc.nextInt();

        primeInRange (num);
    }
}
