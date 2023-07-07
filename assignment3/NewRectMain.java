/*
Assignment 3
Author: Cameron Bauman
Date: 02/06/2023
Purpose: Create a Program class that create's a new Rect object and executes all of its methods in the main (for the new rectangle class)
 */
package assignment3;

public class NewRectMain {

    public static void main(String[] args) {

        NewRect r2 = new NewRect(3, 7, 0, -20);  // New Rect object with parameters to be passed into constructor
        
        NewRect r3 = new NewRect(2, 5, 5, 3);
        
        r2.calcPerimeter();    // Calling methods using new parameters

        r2.calcArea();
        
        r2.moveRect(18, 21);  
        
        r2.biggerRect(r3);    // Pass in new rectangle object as parameter to compare areas. Returns the string "True" if the first rectangle area is bigger.

        r2.printResult(r3);   // Pass in new rectangle object so the result of that method can be printed
        
        r2.changeSize(5);    // Pass in new length and width for change size method
        
        r2.printResult(r3);    // Print the results of the methods again after the changeSize method was called
    }

}
