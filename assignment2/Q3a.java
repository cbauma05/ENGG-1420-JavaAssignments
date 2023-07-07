/*
Assignment 2, Q3a
Author: Cameron Bauman
Date: 01/23/2023
Purpose: To modify the output of a code snippet by only adding a { and } 
 */
package assignment2;

public class Q3a {
    
    public static void main(String[] args) 
    {  
       int x = 5, y = 8;
		
	if ( y == 8 )	    // Both if conditions are true so the first print statement is called
        if ( x == 5 )
            
        System.out.println( "@@@@@" );
            else{                           // Therefore, the logic skips past this else loop 
        System.out.println( "#####" );
            }
        System.out.println( "$$$$$" );   // The program continues with the rest of the print statements outside the else.
        System.out.println( "&&&&&" );
        
    }
    
}
