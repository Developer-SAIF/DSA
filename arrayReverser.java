/*
# reverse an integer array inputed by the user

steps: 
-> pass the original array (pass by reference) to a reverser function with void return type
-> the function will swap 1st half of the array with last half of the array using a for loop
-> print out the original function from the main function
*/

import java.util.*;

public class Main 
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.print ("Enter array length: ");
        int length = sc.nextInt();
        
        // initializing array
        int[] array = new int [length];
        
        // taking array elements input
        System.out.print ("Enter array elements: ");
        for (int i = 0; i < length; i++)
            array [i] = sc.nextInt();
        
        // reversing array
        reverse (array);
        
        // printing reversed array
        System.out.println (Arrays.toString (array));
    }
    
    public static void reverse (int array[]) 
    {
        int temp;
        int j = array.length - 1;
        
        for (int i = 0; i <= j/2; i++)
        {
            temp = array [j - i];
            array [j - i] = array [i];
            array [i] = temp;
        }
    }
}
