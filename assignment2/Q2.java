/*
Assignment 2, Q2
Author: Cameron Bauman
Date: 01/23/2023
Purpose: Calculate and print all prime numbers between 0 and 10,000 using switch case and for statements
 */
package assignment2;

public class Q2 {

    public static void main(String[] args) {

        int primeNum;                  // Variable to store the status of the number's primality

        for (int var = 2; var <= 10000; var++) {   // Outer for loop counts from 2 to 10,000. 
            primeNum = 2;                          // Initialize status to 2

            for (int i = 2; i < var; i++) {  // Inner for loop counts up each divisor of the current number being checked for primality. If the number is evenly divisible, the status of primeNum is changed to 0 (false)
                if (var % i == 0) {
                    primeNum = 0;
                    break;                   // If the number is not a prime number it will break out of the for loop for this iteration and continue to the switch case.
                }
            }

            switch (primeNum) {
                case 2:                      // If the status of primeNum remained unchanged at 2, it is a prime number and is printed in the terminal.
                    System.out.println(var);
                    break;                   // Logic breaks out of switch case

                default:                    // If the status of primeNum is anything other than 2, (0) it is not a prime number and it breaks out of the switch case without printing.
                    break;

            }                               // var is incremented in the outer for loop and this is repeated for each number up to 10,000.
        }

    }
}
