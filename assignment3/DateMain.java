/*
Assignment 3
Author: Cameron Bauman
Date: 02/06/2023
Purpose: Create a main class for the previous date class and execute all the methods
 */
package assignment3;

public class DateMain {

    public static void main(String[] args) {

        Date currentDate = new Date(); // Declare new date object with its defined variables

        currentDate.day = 15;
        currentDate.month = 3;
        currentDate.year = 2023;

        Date date1 = new Date();      // Declare new date object with its defined variables

        date1.day = 20;
        date1.month = 3;              // *Note* the second date should be the after the first date for the method to work
        date1.year = 2023;

        System.out.printf("The number of days between dates is %d.\n", currentDate.compare(date1));

        currentDate.print();         // Print current date

        currentDate.addDays(80);   // Call add days method with input parameter
        
        System.out.println("After calling the addDays method...");

        currentDate.print();         // print new date 

        // print the number of days between dates returned by the compare method
    }

}
