/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Matthew Spiker
 */

package baseline;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution36 {
    //main method
    public static void main(String[] args){
        //StatHandler class object

        //create decimal formatter for the average later on

        //calls enterStrings to create an array of user inputs

        //output all items in the array using arrayOutput method

        //calls the average, min, max, and std functions to get their results for the user's inputs

        //output the average, min, max, and standard deviation
    }

    //method to make a string array from user inputs
    public static String[] enterStrings(String prompt){
        //initialize input scanner

        //initialize string "userInput" which is " " by default

        //initialize n arraylist of strings

        //while userInput does not equal "done"
            //output prompt string

            //store user input in userInput string

            //if userInput is not equal to "done"
                //add userInput to the arraylist

        //return the arraylist of strings as an array
        return null;
    }

    //method using a for loop to display all strings in an array
    public static void arrayOutput(String[] array){
        //print pretext

        //for loop to loop through the whole array of strings
            //if not at the end of the array,
                //output array[i] and a comma

                //else output just array[i] string, this is the end of the loop so no comma is needed
    }
}

class StatHandler{
    //method to get the average of a set of numbers (from a string array)
    public double average(String[] array){
        //initialize an integer average equal to 0

        //for loop to go through all strings in the array
            //add array[i]'s number to average

        //after for loop is done, divide average by the length of the array

        //return average
        return 0;
    }

    //method to get the minimum number in an array of strings
    public int min(String[] array){
        //initialize an integer min

        //for loop to go through each string in the array
            //if min is greater than the current string's integer
                //set min to current string's integer

        //return min
        return 0;
    }

    //method to get the maximum number in an array of strings
    public int max(String[] array){
        //initialize an integer max

        //for loop to go through each string in the array
            //if max is less than the current string's integer
                //set max to the current string's integer

        //return max
        return 0;
    }

    //method to get the standard deviation of an array
    public double std(String[] array, int average){
        //create a new arraylist of strings

        //for loop to go through each string in the array
            //standard devation calculation (before the average is found) for current string, add to array

        //get the average of all numbers in the array

        //return the square root of the average of the array
        return 0;
    }
}