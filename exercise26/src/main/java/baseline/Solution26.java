/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Matthew Spiker
 */

package baseline;

public class Solution26 {
    //main method, just grabs input/prompts for input and calls appropriate methods for calculation
    public static void main(String[] args){
        //initialize input scanner, create class object for paymentCalculator

        //input/output sequence to get information from user
        //assign use inputs to double values as necessary

        //call payOffTime with user-input parameters for dailyRate, balance, and monthlyPayment, assign to a string

        //output resulting string
    }
}

//class to handle monetary calculations
class paymentCalculator{
    //method to calculate months to pay off a credit card given daily rate, current balance, and monthly payment amounts
    public String payOffTime(double dailyRate, double balance, double monthlyPayment){
        //calculate the amt of months left to make payments using the given formula

        //round the resulting value up, per instructions

        //use formatDollars method to properly format the value into a string

        //return the string
        return null;
    }

    //method to properly format a double value to a whole number of months
    public String formatDollars(double value){
        //write the value to a string

        //change the string to a substring of itself before the decimal place


        //return the string
        return null;
    }
}