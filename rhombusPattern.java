/*
# create a solid rhombus pattern from user input
*/

import java.util.Scanner;

public class Main 
{
    public static void Rhombus (int length) 
    {
        for (int i = 1; i <= length; i++) 
        {
            for (int j = 1; j <= (length - i); j++) 
            {
                System.out.print ("  ");
            }
            for (int k = 1; k <= length; k++) 
            {
                System.out.print (" #");
            }
            System.out.println();
        }
    }


    public static void main (String [] args) 
    {
        Scanner sc = new Scanner (System.in);
        
        int length = sc.nextInt();
        
        Rhombus (length);
    }
}
