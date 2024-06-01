/*
# get length input from user and create a butterfly pattern (2nd approach)
*/

import java.util.Scanner;

public class Main 
{
    public static void butterflyPattern (int length) 
    {
        for (int i = 1; i <= length; i++)
        {
            for (int j = 1; j <= length; j++)
            {
                if (((j > i) && (i + j < length+1)) || ((i + j > length+1) && (j < i)))
                    System.out.print ("  ");
                else
                    System.out.print (" #");
            }
            
            System.out.println();
        }
    }

    public static void main (String [] args) 
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.print ("Length: ");
        int length = sc.nextInt();

        butterflyPattern (length);
    }
}
