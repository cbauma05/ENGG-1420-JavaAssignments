/*
Assignment 4
Author: Cameron Bauman
Date: 02/13/2023
Purpose: Create a main class for the book class. Create multiple book objects and call the previously built methods with them.
 */
package assignment4;

public class BookMain {
    
    public static void main(String[] args){
        
        Book book1 = new Book("basics of learning java", "Cameron Bauman, Tyler Bauman", 350, 2023, 49.99);  // Create 1st book object
        Book book2 = new Book("Star Wars: Attack of the Clones", "George Lucas", 400, 2005, 45.50); // Create 2nd book object
        
        System.out.println("The title of book 1 in title case format is: " + book1.getTitleInTitleCase());  // Call getTitleInTitleCase method
        
        System.out.println(book2.contains("Wars"));  // Call contains method
        
        book1.printAuthors();
        
    }
    
}
