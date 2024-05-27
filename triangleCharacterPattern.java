/*
# triangle character pattern.
*/

import java.util.Scanner;

public class Main 
{
    public static void main (String [] args) 
    {
        Scanner sc = new Scanner (System.in);
        
        char ch = 'A';
        
        System.out.print ("Line numbers: ");
        int line = sc.nextInt();
        
        for (int i = 1; i <= line; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print (ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
