/*
Assignment 4
Author: Cameron Bauman
Date: 02/13/2023
Purpose: Create a circle class and create methods that add to the a circle objects current radius. This will be done in 2 methods and they will take a circle obkect and array of circle objects as parameters.
 */
package assignment4;

import java.util.List;
import java.util.ArrayList;

public class Circle {

    double r;   // Declare instance variable for radius

    public Circle(double r) {  // Circle constructor
        this.r = r;
    }

    public void addRadius(Circle circle) {   // addRadius method to add radius of other circle objects

        this.r += circle.r;
    }

    public void addAll(Circle[] circleArr) {  // addAll method that takes array of circle objects as parameter and adds the radius to the object being called with

        for (int i = 0; i < circleArr.length; i++) {

            this.r += circleArr[i].r;
        }

    }
    
    public Circle[] decompose() {   // *NOTE* I was unsure of what the final method was supposed to accomplish. I tried setting up a method blueprint using lists and Arraylists but it was unable to work
    List<Circle> circles = new ArrayList<>(); 
    double decomposedRadius = r;

    return circles.toArray(new Circle[circles.size()]); // Return circles to array
  }
}
    


