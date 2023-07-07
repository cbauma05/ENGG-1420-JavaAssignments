/*
Assignment 2, Q4
Author: Cameron Bauman
Date: 01/23/2023
Purpose: Take integer inputs from the user and add them together until they enter a 0. Then print the sum.
 */
package assignment2;

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, sum = 0;             // Declare variable for user input and sum of inputs (set to 0)

        System.out.println("Please enter a set of numbers: ");  // Prompt user

        while (true) {                // Use an indefinite while loop that scans user inputs 

            num = input.nextInt();

            if (num == 0) {         // If the user enters a 0 the loop will break out without adding any further inputs
                break;
            }

            sum += num;           // Add the new integer to the previous sum

        }

        System.out.println("The final sum is: " + sum); // Print the total sum
    }
}
