/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Matthew Spiker
 */

package baseline;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution29 {
    //main input/output function
    public static void main(String[] args) {
        //initialize input scanner, decimal format, and rate variable
        Scanner input = new Scanner(System.in);
        DecimalFormat roundup = new DecimalFormat("0.#");
        String rate = null;

        //while rate is not a valid number (determined by isNum method)
        while (!isNum(rate)) {
            //prompt for user input
            System.out.print("What is the rate of return? ");

            //store user input in the rate string
            rate = input.nextLine();

            //if the rate string is still not a number, print an error message and loop back around to get new input
            if (!isNum(rate)) System.out.print("Sorry. That's not a valid input.\n");
        }

        //calls the years() function to calculate the amount of years
        double years = years(rate);

        //format the final years String using the previously initialized decimal formatter
        String finalYears = roundup.format(years);

        //print "It will take finalYears years to double your initial investment."
        System.out.printf("It will take %s years to double your initial investment.", finalYears);
    }

    //function to calculate years
    public static double years(String rate){
        //return (72 / rate) as a double value
        return 72/Double.parseDouble(rate);
    }

    //function to test if a string is a number
    public static boolean isNum(String string){
        try{
            //tries to parse the string into a double, returns false if it can't or if it can, but it is 0 or less
            Double.parseDouble(string);
            return Double.parseDouble(string) > 0;
        } catch (NumberFormatException e){
            return false;
        }
    }
}