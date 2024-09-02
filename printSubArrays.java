/*
# print all the sub-arrays from an integer array inputed by the user
steps:
-> take array size input & array element inputs
-> pass the array to a function 
-> the function will use 2 nested for loop
-> the outer for loop will control the starting index
-> the inner for loop will control the ending index
-> using the indexes, a built in function will print out sub-arrays
*/

import java.util.*;

public class printSubArrays 
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
        subArray (array);
	}

	public static void subArray(int array[]) 
	{
		//Starting index
		for (int i = 0; i < array.length; i++) 
		{ 
			//Ending index
			for (int j = i+1; j <= array.length; j++) 
			{ 
			    int[] rangeArray = Arrays.copyOfRange (array, i, j);
				System.out.println (Arrays.toString (rangeArray));
			}
			System.out.println();
		}
	}
}
