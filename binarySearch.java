/*
# use binary search algorithm, to find the index of a key, in a sorted integer array of increasing frequency

steps:
-> take array size input and initialize array
-> take input of a sorted integer array of increasing frequency
-> call a function which will use binary search algorithm to return the index of the provided key
*/

import java.util.Scanner;

public class Main 
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.print ("Enter array length: ");
        int length = sc.nextInt();
        
        // initializing array
        int[] array = new int [length];
        
        // taking sorted Integer array input of increasing frequency
        System.out.println ("Enter increasing array elements: ");
        for (int i = 0; i < length; i++)
            array [i] = sc.nextInt();
        
        // taking key input to perform binary search
        System.out.print ("Enter key: ");
        int key = sc.nextInt();
        
        // printing result
        System.out.printf ("The index of %d is: ", key);
        System.out.print (binarySearch (array, key));
    }
    
    public static int binarySearch (int[] array, int key) 
    {
        int start = 0;  int end = (array.length-1);
        int mid;
        
        while (start <= end) 
        {
            mid = (start + end)/2;
            
            if (key == array [mid]) 
                return mid;
                
            if (key > array [mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}
