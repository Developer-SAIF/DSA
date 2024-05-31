/*
# create a inverted half pyramid pattern by taking row & column number input from user
*/

import java.util.Scanner;

public class Main 
{
    public static void InvHalfPyr (int length) 
    {
        for (int i = 1; i <= length; i++) 
        {
            // Spaces.
            for (int j = 1; j <= (length - i); j++)
                System.out.print ("  ");

            // Hashes.
            for (int k = 1; k <= i; k++) 
                System.out.print (" #");

            System.out.println();
        }
    }

    public static void main (String [] args) 
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.print ("Lines: ");
        int length = sc.nextInt();

        InvHalfPyr (length);
    }
}
