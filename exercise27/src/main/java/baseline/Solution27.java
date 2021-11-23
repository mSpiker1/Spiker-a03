/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Matthew Spiker
 */

package baseline;

public class Solution27 {
    //main method to get input and call validateInput method
    public static void main(String[] args){
        //initialize input scanner

        //input/output sequence with user to grab id values as strings

        //call validateInput method to validate the strings and create an error string

        //output error string
    }
}

class Validate{
    //method to create a string containing any errors found when calling validation methods for the string parameters
    public static String validateInput(String first, String last, String id, String zip){
        //create an int to count any errors found, so a unique message can be output if it is 0 after validation

        //if/else statement to call each validation method. if a validation method returns false, a new line containing
        //an error will be added to the string. if the end is reached and the error count is 0, the error string will
        //simply be set to "no errors were found."

        //return the string
        return null;
    }

    //method to validate a name, returns false if error is found, returns true otherwise
    public boolean nameValid(String name){
        //if the length of name is less than 2, return false. Otherwise, return true (done in return statement)
        return false;
    }

    //method to validate an id, returns false if error is found, returns true otherwise
    public boolean idValid(String id){
        //create a pattern to match id to

        //if id matches the pattern, return true. Otherwise, return false (done in return statement)
        return false;
    }

    //method to validate a zip code, returns false if error is found, returns true otherwise
    public boolean zipValid(String zip){
        //try to parse zip as an integer using a try statement, return true after the parse statement. if an exception
        //is caught, return false in the catch block
        return false;
    }
}