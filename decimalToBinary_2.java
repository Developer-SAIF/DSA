/*
# convert a decimal input to binary (another method)

steps:
-> converts using successive division method
-> a while loop, in each steps, gets remainder = decimal % 2 and makes decimal input half
-> then it positions the remainder in position by multiplying it to appropriate value
-> the result binary value is returned at the end
*/

import java.util.*;

public class Main 
{
    public static long makebin (int decimal) 
    {
        long resultBin = 0;
        long multiplier = 1;
        int remainder;
        
        while (decimal != 0)
        {
            remainder = decimal % 2;
            decimal /= 2;
            
            resultBin += remainder * multiplier;
            multiplier *= 10;
        }
        
        return resultBin;
    }

    public static void main (String [] args) 
    {
        Scanner sc = new Scanner (System.in);
        
        int decimal = sc.nextInt();
        
        System.out.println (makebin (decimal)); 
    }
}
