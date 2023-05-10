/*
Assignment 2, Q3b
Author: Cameron Bauman
Date: 01/23/2023
Purpose: To modify the output of a code snippet by only adding a { and } b)
 */
package assignment2;

public class Q3b {
    
    public static void main(String[] args)
    {
        int x = 5, y = 8;
		
	if ( y == 8 )    // Both if statements are true so the logic follows through them and the first print function is called.
        if ( x == 5 )
            
        System.out.println( "@@@@@" );
        else{
        System.out.println( "#####" );  // Since both if conditions are met, none of the functions in the else loop are called.
        System.out.println( "$$$$$" );
        System.out.println( "&&&&&" );
            }
    }
    
}
    
