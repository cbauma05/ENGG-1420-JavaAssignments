/*
Assignment 3
Author: Cameron Bauman
Date: 02/06/2023
Purpose: Create a date class for the concept of a date. Then create several methods; print, addDays, and compare.
 */
package assignment3;

public class Date {

    int day, month, year;

    void print() {

        System.out.printf("The Date Is: %d/%d/%d\n", this.month, this.day, this.year);
    }

    void addDays(int n) {

        int month[] = {31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30};

        int i = this.month - 1;  // Takes the month that was passed in and subtracts one to  accuractely determine number of days in given month

        int day = this.day + n;  // Add number of days passed in as n onto current number of days in the month

        while (day > month[i]) {

            day -= month[i];    // subtract days of the month from total days previously calculated for updated number of days in current month

            if (this.month == 12) { // conditions for end of year
                this.year++;
                this.month = 0;
                i = -1;         // set i to -1 to restart the element of the array month. If it is the last month of the year
            }

            this.month++;    // increment month
            i++;
        }

        this.day = 0;       // does not meet condition of while loop, add days
        this.day += day;
    }

    int compare(Date date1) {

        int numDays = 0;
        int month[] = {31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30};

        int yearDifference = Math.abs(this.year - date1.year);  // Find the difference of years (no negative values)

        numDays += Math.abs(this.day - date1.day);  // Add the day difference

        if (this.year != date1.year) {         // process to add remaining years
            numDays += yearDifference * 365;
        }

        while (this.month > date1.month) {   // Case for when current month is greater than the month that is being compared

            for (int i = this.month - 1; i > date1.month - 1; i--) {

                numDays -= month[i]; // subtract the number of days
            }
            break;
        }

        while (this.month < date1.month) {   // Case for when the current month is less than the month that is being compared

            for (int i = this.month - 1; i < date1.month - 1; i++) {

                numDays += month[i];
            }
            break;
        }

        return numDays;       // Return the total number of days between the two dates being compared
    }
}
