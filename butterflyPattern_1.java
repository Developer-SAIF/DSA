/*
# get half length input from user and create a butterfly pattern (1st approach)
*/

import java.util.Scanner;

public class Main 
{
    public static void butterflyPattern (int length) 
    {
        // First half.
        for (int i = 1; i <= length; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(" #");
            }
            
            //Space
            for (int k = 1; k <= 2*(length-i); k++) 
            {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) 
            {
                System.out.print(" #");
            }

            System.out.println();
        }
        // Last half.
        for (int i = length; i >= 1; i--) 
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(" #");
            }
            
            //Space
            for (int k = 1; k <= 2*(length-i); k++) 
            {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) 
            {
                System.out.print(" #");
            }

            System.out.println();
        }

    }

    public static void main (String [] args) 
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.print ("Half length: ");
        int length = sc.nextInt();

        butterflyPattern (length);
    }
}
