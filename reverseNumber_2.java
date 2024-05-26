/*
# print the reverse of inputed integer (alternative method)

steps:
-> each time, add input % 10 to a string and do input /= 10 until input becomes zero
-> finally print the string
*/

import java.util.*;

public class Main 
{
    public static void main (String args []) 
    {
        Scanner sc = new Scanner (System.in);

        String revnum = "";

        for ( int num = sc.nextInt(); num != 0; num /= 10 ) 
        {
            revnum = revnum + num%10;
        }

        System.out.println (revnum);
    }
}
