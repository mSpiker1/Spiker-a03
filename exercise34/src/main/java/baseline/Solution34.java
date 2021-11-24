/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Matthew Spiker
 */

package baseline;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution34 {
    //main method
    public static void main(String[] args){
        //ArrayManager class object

        //create an input scanner

        //create a string array of employee names

        //use arrayOutput method to output all current employee names

        //prompt user for an employee name to remove

        //save user input to a string "remove"

        //use arrayMatch method to get the number in the array that corresponds to user input, or size+1 if none match

        //if match is equal to size + 1
            //tell the user the name does not match, output all employee names again

        //else
            //use removeArray method to remove a name from the employee array

        //output the full array
    }
}

class ArrayManager{
    //method to remove a string from an array
    public String[] removeArray(String[] array, int remove){
        //convert array to a list of strings

        //remove string #remove from the list

        //set the array equal to the edited list of strings

        //return the array
        return null;
    }

    //method using a for loop to display all strings in an array
    public void arrayOutput(String[] array){
        //output how many employees are in the list

        //use a for loop to output all employees in the array
    }

    //function to loop through a string array and try to match it with user a user input string
    public int arrayMatch(String[] array, String userInput){
        //use a for loop to go through each string in the array
            //if the user input equals string i from the array
                //return i

        //if the for loop completes, return the length of the array + 1
    }
}