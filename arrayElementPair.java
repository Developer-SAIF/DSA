/*
# print all the 2 element pairs from an integer array inputed by the user
steps: 
-> take array size input & array element inputs
-> pass the array to a function to printout all 2 element unique pairs
-> the function will use 2 nested for loop
-> the outer for loop will control the first element
-> the inner for loop will control the second element
*/

import java.util.*;

public class Main 
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner (System.in);

        System.out.print ("Array length: ");
        int n = sc.nextInt();

        // initializing array
        int[] array = new int [n];

        // taking array elements input
        System.out.print ("Enter array elements: ");
        for (int i = 0; i < array.length; i++)
            array [i] = sc.nextInt();

        // calling function
        printPairs (array);
    }

    public static void printPairs (int array[]) 
    {
        int pairCount = 0;
        
        for (int i = 0; i < array.length; i++)
        {
            for (int j = i + 1; j < array.length; j++)
            {
                System.out.print ("(" + array [i] + "," + array [j] + ") ");
                pairCount++;
            }
        }
        System.out.println();
        System.out.println ("Pair count: " + pairCount);
    }
}


