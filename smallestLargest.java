/*
# finding largest & smallest integer in a user inputed array.

steps:
-> take array size input and initialize array
-> take array elements input
-> call findLargest & findSmallest to evaluate largest and smallest
-> the functions will printout there findings
*/

import java.util.Scanner;

public class Main 
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.print ("Number of integers? : ");
        int size = sc.nextInt();
        
        int[] integers = new int [size];
        
        System.out.printf ("Enter %d integers: ", size);
        for (int i = 0; i < size; i++)
        {
            integers [i] = sc.nextInt();
        }
        
        findLargest (integers);
        findSmallest (integers);
    }
    
    public static void findSmallest (int array[]) 
    {
        int smallest = (int)Double.POSITIVE_INFINITY;
        
        for (int i = 0; i < array.length; i++) 
        {
            if (array [i] < smallest)
                smallest = array [i];
        }
        System.out.println ("Smallest value: " + smallest);
    }

    public static void findLargest (int array[]) 
    {
        int largest = (int)Double.NEGATIVE_INFINITY;
        
        for (int i = 0; i < array.length; i++) 
        {
            if (array [i] > largest)
                largest = array [i];
        }
        System.out.println ("Largest value: " + largest);
    }
}
