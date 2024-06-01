/*
# create a hollow rhombus pattern from user input
*/

import java.util.Scanner;

public class Main 
{
    public static void hollowRhombus (int length) 
    {
        for (int i = 1; i <= length; i++) 
        {
            for (int k = 1; k <= (length-i); k++) 
                System.out.print ("  ");
            
            for (int j = 1; j <= length; j++) 
            {
                if (i == 1 || j == 1 || i == length || j == length) 
                    System.out.print (" #");
                
                else 
                    System.out.print ("  ");
            }
            
            System.out.println();
        }
    }


    public static void main (String [] args) 
    {
        Scanner sc = new Scanner (System.in);
        
        int length = sc.nextInt();
        
        hollowRhombus (length);
    }
}
