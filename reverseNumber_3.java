/*
# print the reverse of inputed integer (2nd alternative method)

steps:
-> while input != 0, each time, do variable *= 10 
-> then add input % 10 to the variable 
-> then do input /= 10
-> finally print the variable
*/

import java.util.*;

public class Main 
{    
    public static void main (String args []) 
    {
        Scanner sc = new Scanner (System.in);

        int revnum = 0;

        for ( int num = sc.nextInt(); num != 0; num /= 10 ) 
        {
            revnum *= 10;            
            revnum += num%10;
        }

        System.out.println (revnum);
    }
}
