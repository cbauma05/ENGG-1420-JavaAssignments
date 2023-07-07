/*
Assignment 3
Author: Cameron Bauman
Date: 02/06/2023
Purpose: Modify previous rectangle class. Implement a constructor with the inputs of coordinates and length and width. Ensure that inputs of zero are set to 1 and the absolute value of all inputs are considered. Add an IsBiggerThan method.
 */
package assignment3;

public class NewRect {

    private double length, width, x, y;  // Declare instance variables

    public NewRect(double x, double y, double length, double width) {  // Constructor
        this.length = length;
        this.width = width;

        if (this.length < 0) {                     // Set absolute value of each input for each variable
            this.length = Math.abs(this.length);
        }
        if (this.width < 0) {
            this.width = Math.abs(this.width);
        }
        if (this.length == 0) {                   // Set inputs of 0 to 1
            this.length = 1;
        }
        if (this.width == 0) {
            this.width = 1;
        }
    }
    
    public NewRect(double x, double y){   // Constructor for coordinates
        this.x = x;
        this.y = y;
    }

    double calcPerimeter() {   // Method to calculate perimeter

        return 2 * (this.length + this.width);
    }

    double calcArea() {        // Method to calculate area

        return (this.length * this.width);
    }

    void moveRect(double x, double y) {  
        this.x = x;
        this.y = y;
        System.out.printf("The new coordinates are: (%.2f, %.2f)\n", this.x, this.y);
    }

    void changeSize(double n) {    // method to change size
        this.length = n;
        this.width = n;
        System.out.println("After changing the size of the first rectangle, the width and length are: " + this.length + "\n");
    }

    void printResult(NewRect r3) {   // method to print results of rectangle

        System.out.println("The perimeter of the first rectangle is: " + calcPerimeter());
        System.out.println("The area of the first rectangle is: " + calcArea());
        System.out.println("It is " + biggerRect(r3) + " that the first rectangle is bigger than the second rectangle");
    }
    boolean biggerRect(NewRect r3){   // method with boolean return type to compare areas of two rectangle objects
        if (this.calcArea() > r3.calcArea()){
            return true;
        }
        else{
            return false;
        }
        
    }

    
    
}

