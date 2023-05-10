/*
Assignment 3
Author: Cameron Bauman
Date: 02/06/2023
Purpose: Create a Rect class for concept of a rectangle. Include parameters x and y and inplement methods to calculate: Perimeter, Area, etc.
 */
package assignment3;

public class Rect {

    double length, width, x, y;   // Declare instance variables

    double calcPerimeter() {   // Method to calculate perimeter

        return 2 * (this.length + this.width);
    }

    double calcArea() {        // Method to calculate area

        return (this.length * this.width);
    }

    void moveRect(double x, double y) {  // Method that takes x and y coordinates as parameters and prints the new coordinates
        this.x = x;
        this.y = y;
        System.out.printf("The new coordinates are: (%.2f, %.2f)\n", this.x, this.y);
    }

    int changeSize(int n) {  // Method for a new size of rectangle to be inputed as its paramter to change its size

        return n;
    }

    void printResult() {    // Method to print the results from each previous method

        System.out.println("The perimeter is: " + calcPerimeter());
        System.out.println("The area is: " + calcArea());
        System.out.printf("The new width is: %d and the new length is: %d\n", changeSize(6), changeSize(9));

    }

}
