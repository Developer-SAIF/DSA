/*
# create a diamond pattern from user input
*/

import java.util.Scanner;

public class Main 
{
    public static void diamond (int length) 
    {
        for (int i = 1; i <= length; i++) 
        {
            // Space
            for (int k = 1; k <= (length+1-i); k++) 
            {
                System.out.print ("  ");
            }
            
            // Symbol
            for (int j = 1; j <= (2*i-1); j++) 
            {
                System.out.print (" #");
            }
            System.out.println();
        }
        
        // Middle line
        for (int l = 1; l <= (2*length+1); l++) 
        {
            System.out.print (" #");
        }
        
        System.out.println();
        
        for (int i = length; i >= 1; i--) 
        {
            // Space
            for (int k = 1; k <= (length+1-i); k++) 
            {
                System.out.print ("  ");
            }
            // Symbol
            for (int j = 1; j <= (2*i-1); j++) 
            {
                System.out.print (" #");
            }
            System.out.println();
        }
    }


    public static void main (String [] args) 
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.print ("Half length: ");
        int length = sc.nextInt();
        
        diamond (length);
    }
}
