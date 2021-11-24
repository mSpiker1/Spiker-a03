/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Matthew Spiker
 */

package baseline;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Solution31 {
    public static void main(String[] args){
        //initialize key variables, String age, String restingHR, double intensity

        //prompt user for age
        //get age using getNumString method to ensure the input is numeric

        //prompt user for resting heart rate
        //get restingHR using getNumString method to ensure the input is numeric

        //print out top line of table using restingHR, age, and intensity strings

        //output sequence in a for loop [for(int i=55; i<96; i+=5)]
            //output intensity level (i), and output bpm string returned from calling karvonen method with appropriate parameters
            //raise intensity variable (double) by 0.05 before next loop
    }

    //function to test if a string is a number
    public static boolean isNum(String string){
        //tries to parse the string into a double, returns false if it can't or if it can, but it is 0 or less
        return false;
    }

    //function that takes in age and pulse
    public static String karvonen(String age, String pulse, double intensity){
        //initialize a decimal formatter to use before returning the string with the result stored in it

        //does the math for Karvenon target heart rate using the given parameters on method call

        //return the number formatted properly as a string
        return null;
    }

    public static String getNumString(String string){
        //initialize input scanner to take input

        //while string is not a number
            //get user input and store in string variable
            //if string is still not a number
                //output "Please only enter a whole number!\n"

        //returns the string once the while loop is exited
        return null;
    }
}