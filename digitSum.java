/*
# calculate the sum of all the digits of an integer input

steps:
-> calls digitSum function with input
-> the function runs a for loop to calculate the sum of all digits until input != 0
-> rightmost digit of the input is extracted each time & added to the sum variable
-> at the end, the function returns the calculated digit sum
*/

import java.util.Scanner;

public class Main 
{
    public static int digitSum (int num) 
    {
        int sum = 0;
        
        for (int lastDigit; num != 0; num /= 10)
        {
            lastDigit = num % 10;
            sum += lastDigit;
        }
        
        return sum;
    }

    public static void main (String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        
        int num = sc.nextInt();
        
        System.out.print (digitSum (num)); 
    }
}
