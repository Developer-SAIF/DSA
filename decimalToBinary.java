/*
# convert a decimal input to binary

steps:
-> calls toDecimal function with the binary input
-> toDecimal returns the sum of each binary digit multiplied by its corresponding multiplier
*/

import java.util.Scanner;

public class Main 
{
    public static int toDecimal (long binary) 
    {
        int decimal = 0;
        
        for (int multiplier = 1; binary != 0; multiplier *= 2, binary /= 10) 
        {
            decimal += (binary % 10) * multiplier;
        }
        
        return decimal;
    }

    public static void main (String [] args) 
    {
        Scanner sc = new Scanner (System.in);
        
        long binary = sc.nextLong();
        System.out.println (toDecimal (binary)); 
    }
}
