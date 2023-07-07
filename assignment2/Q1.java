/*
Assignment 2, Q1
Author: Cameron Bauman
Date: 01/23/2023
Purpose: Calculate and print all prime numbers between 0 and 10,000 using if-else and while statements
 */
package assignment2;

public class Q1 {

    public static void main(String[] args) {

        int var = 2; // initialize variable to store value counting from 1 to 10000

        boolean primeNum; // declare boolean variable that determines true or false if it is prime number or not

        while (var <= 10000) {  // while loop that goes through the specified range of numbers

            primeNum = true;  // assuume the number is prime until it is checked

            for (int i = 2; i <= var / 2; i++) {   // This for loop will count through each possible divisor of the value of var. It only counts up until half of the value of var because its possible divisors would only be in that range.
                if (var % i == 0) {                // If the remainder of var and the incrementing value equal 0, the value of primeNum = false and the loop is broken. 
                    primeNum = false;              // This determines that the value of var is not a prime number
                    break;
                }
            }

            if (primeNum) {                        // If the value of primeNum is still true after checking for dvisiors with remainder 0 in the for loop, the value of var is printed  (it is a prime number)
                System.out.println(var);
            }
            var++;                                 // The value of var is incremented after checking if it was a prime number or not
        }
        // This process repeats for each value of var from 2 to 10,000
    }
}
