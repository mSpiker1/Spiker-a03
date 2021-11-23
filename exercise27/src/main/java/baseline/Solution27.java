/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Matthew Spiker
 */

package baseline;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution27 {
    //main method to get input and call validateInput method
    public static void main(String[] args){
        //initialize input scanner
        Scanner input = new Scanner(System.in);

        //input/output sequence with user to grab id values as strings
        System.out.print("Enter the first name: ");
        String first = input.nextLine();
        System.out.print("Enter the last name: ");
        String last = input.nextLine();
        System.out.print("Enter the ZIP code: ");
        String zip = input.nextLine();
        System.out.print("Enter the employee ID: ");
        String id = input.nextLine();

        //call validateInput method to validate the strings and create an error string
        String errorOut = Validate.validateInput(first, last, zip, id);

        //output error string
        System.out.println(errorOut);
    }
}

class Validate{
    //method to create a string containing any errors found when calling validation methods for the string parameters
    public static String validateInput(String first, String last, String zip, String id){
        //Validate class object
        Validate v = new Validate();

        //create an error string that is empty by default
        String errorOut = "";

        //if statements to call each validation method. if a validation method returns false, a new line containing
        //an error will be added to the string. if the end is reached and the error string is empty, the error string
        //will simply be set to "no errors were found."

        //first name validation
        if(!v.nameValid(first)){
            //create string with error message
            String error = "The first name must be at least 2 characters long.\n";

            //add error string to errorOut
            errorOut += error;
        }

        //last name validation
        if(!v.nameValid(last)){
            //create string with error message
            String error = "The last name must be at least 2 characters long.\n";

            //add error string to errorOut
            errorOut += error;
        }

        //zip validation
        if(!v.zipValid(zip)){
            //create string with error message
            String error = "The zipcode must be a 5 digit number.\n";

            //add error string to errorOut
            errorOut += error;
        }

        //id validation
        if(!v.idValid(id)){
            //create string with error message
            String error = "The employee ID must be in the format of AA-1234.\n";

            //add error string to errorOut
            errorOut += error;
        }

        //if errorOut is still empty, set it to no errors string
        if(errorOut.equals("")){
            //set errorOut string to say no errors were found
            errorOut = "There were no errors found.";
        }

        //return the string
        return errorOut;
    }

    //method to validate a name, returns false if error is found, returns true otherwise
    public boolean nameValid(String name){
        //if the length of name is less than 2, return false. Otherwise, return true (done in return statement)
        return name.length() > 1;
    }

    //method to validate an id, returns false if error is found, returns true otherwise
    public boolean idValid(String id){
        //create a pattern to match id to
        String pattern = "[a-zA-Z]{2}[-][0-9]{4}";

        //if id matches the pattern, return true. Otherwise, return false (done in return statement)
        return Pattern.matches(pattern, id);
    }

    //method to validate a zip code, returns false if error is found, returns true otherwise
    public boolean zipValid(String zip){
        //try to parse zip as an integer using a try statement, return true after the parse statement. if an exception
        //is caught, return false in the catch block
        try{
            Integer.parseInt(zip);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}