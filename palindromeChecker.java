/*
# check if an input integer is palindrome or not.

steps:
-> calls isPalindrome function with input
-> isPalindrome function calls numReserver function for the reversed number
-> then it compares input number with reversed number
-> if they are equal, then it returns true, unless returns false
*/

import java.util.Scanner;

public class Main 
{
    public static int numReserver (int num) 
    {
        int reversedNum = 0;
        
        for ( ; num != 0; num /= 10) 
        {
            reversedNum *= 10;            
            reversedNum += num%10;
        }

        return reversedNum;
    }
    
    public static boolean isPalindrome (int num) 
    {
        int reversedNum = numReserver (num);
        
        if (reversedNum == num) 
            return true;
        else
            return false;
    }

    public static void main (String [] args) 
    {
        Scanner sc = new Scanner (System.in);
        
        int num = sc.nextInt();
        
        System.out.print ("Palindrome: " + isPalindrome (num));
    }
}
