/*
# write a linear search code for an string array inputed by the user

steps:
-> take array size input and initialize array
-> take array elements input
-> take input of the element (key) that needs to be searched
-> call a custom function with array and key to search for key
-> it should return the index of 1st occurence of the key, if found
*/

import java.util.Scanner;

public class Main 
{
    public static void main (String [] args) 
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.print ("Enter string array size: ");
        int size = sc.nextInt();
        
        String[] array = new String [size];
        
        System.out.print ("Enter string array elements: ");
        for (int i = 0; i < size; i++)
        {
            array [i] = sc.next();
        }
        
        System.out.print ("Enter a string to search: ");
        String key = sc.next();
        
        int index = linearSearch (array, key);
        
        if (index != -1) 
            System.out.print (key + " found at index: " + index);
        else
            System.out.print (key + " not found");
        
    }

    public static int linearSearch (String array[], String key) 
    {
        for (int i = 0; i <= (array.length-1); i++) 
        {
            if (key.equals (array [i]))
                return i;
        }
        return -1;
    }
}
