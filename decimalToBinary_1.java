/*
# convert a decimal input to binary

steps:
-> converts using successive division method
-> a while loop, in each steps, gets remainder = decimal%2
-> adds the remainder in front of a resultBin string
-> makes decimal /= 2, until decimal value becomes zero
-> after the loop, resultBin string is converted to long & returned
*/

import java.util.*;

public class Main 
{
    public static long makebin (int decimal) 
    {
        int remainder = 0;
        String resultBin = "";
        
        while (decimal != 0)
        {
            remainder = decimal%2;
            resultBin = remainder + resultBin;
            decimal /= 2;
        }
        
        return Long.parseLong (resultBin);
    }

    public static void main (String [] args) 
    {
        Scanner sc = new Scanner (System.in);
        
        int decimal = sc.nextInt();
        
        System.out.println (makebin (decimal)); 
    }
}
