/*
Assignment 3
Author: Cameron Bauman
Date: 02/06/2023
Purpose: Create a Program class that create's a new Rect object and executes all of its methods in the main. (For part 1)
 */
package assignment3;

public class RectMain {
    
    public static void main(String[] args) {
        
        Rect r1 = new Rect();   // Create new Rect object
        
        r1.width = 2;          // Declare variables for the new Rect object
        r1.length = 5;
        r1.x = 0;
        r1.y = 1;
        
        r1.calcPerimeter();    // Call calculate perimeter method
        
        r1.calcArea();         // Call calculate area method
        
        r1.moveRect(8, 12); // Call moveRect method
        
        r1.printResult();       // Call rintResult to print the results of the previous methods 
        
                                // *Note* the changeSize method is called within the printResult method
        
    }
    
}