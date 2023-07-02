/*
Assignment 4
Author: Cameron Bauman
Date: 02/13/2023
Purpose: Create a RandomString class that has a method that tales an int n as a parameter and returns a randomly generated String. The first element cannot be a number but the whole string cna include the alphabet and digits 0-9
 */
package assignment4;

import java.util.Random;

public class RandomString {

    static String nextString(int n) {  // Declare method

        int length = n;   // length of string declared as parameter n

        String charList = "abcdefghijklmnopqrstuvABCDEFGHIJKLMNOPQRSTUV";  // Alphabet without numbers
        String totalList = "abcdefghijklmnopqrstuvABCDEFGHIJKLMNOPQRSTUV0123456789";  // Entire alphabet and numbers

        StringBuilder randStr = new StringBuilder(); // String builder to append and generate final string

        Random randomIndex = new Random();  // Object for generating random number in character list

        int randomCharIndex1 = randomIndex.nextInt(charList.length());   // Get random index from length of character string without numbers

        char randomChar1 = charList.charAt(randomCharIndex1);   // Get random character from character string at the index randomly generated

        randStr.append(randomChar1);  // Append this first character to the randStr String Builder

        for (int i = 0; i < length - 1; i++) {   // For loop to repeat this process but with the whole alphabet and digits

            int randomCharIndex = randomIndex.nextInt(totalList.length());

            char randomChar = totalList.charAt(randomCharIndex);

            randStr.append(randomChar);
        }

        return randStr.toString();  // return final string

    }

    public static void main(String[] args) {

        System.out.println(nextString(10));

    }

}
