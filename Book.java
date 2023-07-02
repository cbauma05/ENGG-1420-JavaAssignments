/*
Assignment 4
Author: Cameron Bauman
Date: 02/13/2023
Purpose: Create a class for the concept of a book including key characteristics like shown below. Implement 3 consrtuctors and 3 methods.
 */
package assignment4;

public class Book {

    String title;
    String authorName;
    int numPages;
    int year;
    double price;

    public Book(String title, String authorName, int numPages, int year, double price) {  // Constuctor #1 to equate parameters to instance variables
        this.title = title;
        this.authorName = authorName;
        this.numPages = numPages;
        this.year = year;
        this.price = price;
    }

    public Book(String title, String authorName, int numPages) {  // Constructor #2 uses this keyword to call constructor #1 and reuse its code to set the instance variables for title, authorName and numPages. It gives default values for rest of parameters
        this(title, authorName, numPages, 0, 0.0);
    }

    public Book(String title, String authorName) {        // Construcot #3 uses this keyword to call constructor #2 and repeat the same process as stated above
        this(title, authorName, 0, 0, 0.0);
    }

    String getTitleInTitleCase() {

        String[] eachWord = title.split(" ");  // Create array of strings for each split that occurs with space character

        StringBuilder TitleCase = new StringBuilder();  // Declare string builder

        for (int i = 0; i < eachWord.length; i++) {    // Create individual string for each split 
            String Word = eachWord[i];

            TitleCase.append(Character.toUpperCase(Word.charAt(0))) // In the empty string, append uppercase character of the first character of each split word
                    .append(Word.substring(1).toLowerCase()) // Then append a substring of each split word that goes from the second character to end of the world and make it lowercase
                    .append(" ");   // Append a space between each word
        }

        return TitleCase.toString();  // Retrun final string

    }

    boolean contains(String doesItContain) {

        String[] string = title.split(" ");  // Create array of strings splits

        for (int i = 0; i < string.length; i++) {  // Create a new string for each split
            String eachString = string[i];

            if (eachString.contains(doesItContain)) { // If each string contains the parameter passed in, break and return true
                return true;

            }
        }

       return false;
    }

    void printAuthors() {

        String[] string = authorName.split(",");  // Create array of strings splits

        for (int i = 0; i < string.length; i++) {  // Create a new string for each split
            String eachName = string[i];
            String trimmedName = eachName.trim();  // Create a new string for each "eachName" to eliminate any blank spaces from each name

            System.out.println(trimmedName);  // Print each Name that was split and trimmed on a new line
        }

    }

}
