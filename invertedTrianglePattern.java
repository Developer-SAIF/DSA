/*
# inverted triangle symbol pattern.
*/

import java.util.Scanner;

public class Main 
{
    public static void main (String [] args) 
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.print ("Line numbers: ");
        int line = sc.nextInt();
        
        System.out.print ("Symbol: ");
        String symbol = sc.next();
        
        for (int i = 1; i <= line; i++) 
        {
            for (int j = line-i; j >= 0; j--) 
            {
                System.out.print(symbol + " ");
            }
            System.out.println("");
        }
    }
}
