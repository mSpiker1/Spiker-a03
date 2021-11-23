/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Matthew Spiker
 */

package baseline;

import java.util.Scanner;

public class Solution26 {
    //main method, just grabs input/prompts for input and calls appropriate methods for calculation
    public static void main(String[] args){
        //initialize input scanner, create class object for paymentCalculator
        Scanner input = new Scanner(System.in);
        PaymentCalculator pc = new PaymentCalculator();

        //input/output sequence to get information from user
        //assign use inputs to double values as necessary
        System.out.print("What is your balance? ");
        double balance = Double.parseDouble(input.nextLine());
        System.out.print("What is the APR on your card (as a percent)? ");
        double dailyRate = (Double.parseDouble(input.nextLine()) * 0.01) / 365; //turn to percent while grabbing
        System.out.print("What is the monthly payment you can make? ");
        double monPay = Double.parseDouble(input.nextLine());

        //call calculateMonthsUntilPaidOff with user-input parameters, assign to a string
        String numMonths = pc.calculateMonthsUntilPaidOff(dailyRate, balance, monPay);

        //output resulting string
        System.out.printf("It will take you %s months to pay off this card.", numMonths);
    }
}

//class to handle monetary calculations
class PaymentCalculator {
    //method to calculate months to pay off a credit card given daily rate, current balance, and monthly payment amounts
    public String calculateMonthsUntilPaidOff(double dailyRate, double balance, double monPay){
        //calculate the amt of months left to make payments using the given formula
        double numMonths = -1 * (Math.log(1 + (balance/monPay * (1 - Math.pow((1 + dailyRate), 30)))) /
                Math.log(Math.pow((1 + dailyRate), 30)));

        //use formatMonths method to properly format the value into a string
        String finalMonths;
        finalMonths = formatMonths(numMonths);

        //return the string
        return finalMonths;
    }

    //method to properly format a double value to a whole number of months
    public String formatMonths(double value){
        //round the number up to the next whole number, regardless of decimal value
        value = Math.ceil(value);

        //write the value to a string
        String newValue = String.valueOf(value);

        //split into an array of two strings, of the strings before and after the decimal
        newValue = newValue.split("\\.")[0];

        //return the first string in the array
        return newValue;
    }
}