/*
Assignment 2, Q3c
Author: Cameron Bauman
Date: 01/23/2023
Purpose: To modify the output of a code snippet by only adding a { and } c)
 */
package assignment2;

public class Q3c {
    
    public static void main(String[] args){
        
        int x = 5, y = 7;
			
        if ( y == 8 )   // The first if statement is false so the logic skips straight to the else statement
        {
             if ( x == 5 )
             System.out.println( "@@@@@" );
	}
        else
        System.out.println( "#####" );
        System.out.println( "$$$$$" );
        System.out.println( "&&&&&" );
        
    }
    
}
