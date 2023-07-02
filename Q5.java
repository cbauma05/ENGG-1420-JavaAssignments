/*
Assignment 4
Author: Cameron Bauman
Date: 02/13/2023
Purpose: Make a program that reads "email" strings from input and assumes the variants of them and prints the variations.
 */
package assignment4;

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Create scanner object

        System.out.println("Enter a list of email addresses:  ");  // prompt user

        String input = sc.nextLine();    // Store user input

        System.out.print("The seperated emails are: \n");  

        email(input);   // Print the individual emails by calling email method

        System.out.println("The number of emails with an underscore is: " + detect_(input));  // Print # of underscores in emails

        System.out.println("The number of emails that use gmail is: " + detectGmail(input));  // Print # of emails with @gmail.com

    }

    static void email(String input) {   // Method that takes input string and seperates it into substrings using the split method

        String[] newEmail = input.split("[;,\\s]+");

        for (String emailList : newEmail) {   // Creates a new string for every email that is split and prints it on a new line
            System.out.println(emailList);
        }
    }

    static int detect_(String input) {

        String[] newEmail = input.split("[;,\\s]+");  // Seperates input string into individual emails 

        int counter = 0;      // counter variable to count and return # of underscore instances

        for (int i = 0; i < newEmail.length; i++) {  // Create a new string for every email that was split 
            String eachEmail = newEmail[i];

            for (int j = 0; j < eachEmail.length(); j++) {  // Scan through each character of the seperated email string and check if it contains an underscore. It will increment the counter

                if (eachEmail.charAt(j) == '_') {
                    counter++;
                }
            }
        }

        return counter;  // return value
    }

    static int detectGmail(String input) {

        String[] newEmail = input.split("[;,\\s]+");  // Seperates input string into individual emails 

        int counter = 0;        // counter variable to count and return # of @gmail instances

        for (int i = 0; i < newEmail.length; i++) {  // Create a new string for each split
            String eachEmail = newEmail[i];

            if (eachEmail.contains("@gmail.com")) { // If individual email contains @gmail.com counter is incremented
                counter++;
            }
        }

        return counter;  // return value
    }

}
