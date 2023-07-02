/*
Assignment 4
Author: Cameron Bauman
Date: 02/13/2023
Purpose: Create a main class for the previous circle class and call all of the methods with specified radius parameters described below
 */
package assignment4;

import java.util.Arrays;
import java.util.Random;

public class CircleMain {

    public static void main(String[] args) {

        Random random = new Random();   // Create new random object to generate random number for radius

        int randNum = random.nextInt(991) + 10; // Generates a random number bound between 10 and up to 1000. The nextInt bound is 991 because that limit is exclusive.

        Circle CircleArray[] = new Circle[100];  // Create new array of circle objects that has 100 elements

        Circle c = new Circle(randNum);  // Create circle object c with random number radius

        System.out.println("The radius of the circle before the addAll function is: " + c.r); // Print radius of circle before addALl function

        for (int i = 0; i < 100; i++) {       // For loop that gives each of the 100 circle objects a radius equal to that respective element in the array of Circle objects
            CircleArray[i] = new Circle(i + 1);
        }

        c.addAll(CircleArray);   // Call the addAll method and pass the CircleArray as a parameter with its radius values already filled from the for loop

        System.out.println("The radius of the circle after the addAll function is: " + c.r);  // Print the new radius of the circle object

        // *NOTE* I was unsure of what the final method was supposed to accomplish. I tried setting up a method blueprint using lists and Arraylists but it was unable to work.
    }

}
