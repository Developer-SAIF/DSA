/*
# create a void rectangle pattern by taking row & column number input from user
*/

import java.util.Scanner;

public class Main 
{
    public static void voidRectangle (int row, int col) 
    {
        for (int i = 1; i <= row; i++) 
        {
            for (int j = 1; j <= col; j++) 
            {
                if (i == 1 || i == row || j == 1 || j == col ) 
                    System.out.print ("# ");
                else 
                    System.out.print ("  ");
            }
            
            System.out.println();
        }
    }

    public static void main (String [] args) 
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.print ("Rows: ");
        int row = sc.nextInt();
        System.out.print ("Columns: ");
        int col = sc.nextInt();
        
        voidRectangle (row, col);
    }
}
