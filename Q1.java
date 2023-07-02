/*
Assignment 4
Author: Cameron Bauman
Date: 02/13/2023
Purpose: Create a program that takes a string as an input and returns it in summary form. This will account for the different characters and number of their instances.
 */
package assignment4;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Create scanner object

        System.out.println("Enter a string input to be summarized: ");  // prompt user

        String input = sc.nextLine();    // Store user input

        System.out.println("The string in summary form is: " + stringSummary(input));  // Print result
    }

    static String stringSummary(String input) {

        StringBuilder sumStr = new StringBuilder();  // Create StringBuilder to append count values onto instances of characters in string

        int counter = 1;       // declare index variable to count instances of characters

        for (int i = 1; i < input.length(); i++) {  

            if (input.charAt(i) == input.charAt(i - 1)) {   // if second element fo the string equals the previous element increment the counter
                counter++;
            } else {
                sumStr.append(input.charAt(i - 1)).append(counter); // else, append the character of this instance and the counter value into the empty string
                counter = 1;
            }
        }

         sumStr.append(input.charAt(input.length() - 1)).append(counter); // for final case in input string, append the last instance character and its respective count if it wasn't accounted for in the for loop.

        return sumStr.toString();
    }

}
