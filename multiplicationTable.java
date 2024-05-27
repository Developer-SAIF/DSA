/*
# program to print the multiplication table of a number N, entered by the user.
*/

import java.util.Scanner;

public class Main 
{
    public static void main (String [] args) 
    {
        Scanner sc = new Scanner (System.in);
        
        int number = sc.nextInt();
        
        System.out.println ("The number table of "+ number +" is,");
        
        for (int i=1; i<=10; i++) 
            System.out.println (number +" X "+ i +" = "+ number*i);
    }
}
