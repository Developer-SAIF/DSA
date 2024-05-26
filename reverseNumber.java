/*
# print the reverse of inputed integer 

steps:
-> each time, print input % 10 and do input /= 10 until input becomes zero
*/

import java.util.*;

public class Main 
{
    public static void main (String args []) 
    {
        Scanner sc = new Scanner (System.in);

        for ( int num = sc.nextInt(); num != 0; num /= 10 ) 
        {
            System.out.print (num % 10);
        }
    }
}
