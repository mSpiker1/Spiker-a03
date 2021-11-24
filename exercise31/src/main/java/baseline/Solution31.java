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
        String age = "default";
        String restingHR = "default";
        double intensity = 0.55;

        //prompt user for age
        System.out.print("Enter your age: ");
        //get age using getNumString method to ensure the input is numeric
        age = getNumString(age);

        //prompt user for resting heart rate
        System.out.print("Enter your resting heart rate: ");
        //get restingHR using getNumString method to ensure the input is numeric
        restingHR = getNumString(restingHR);

        //print out top line of table using restingHR, age, and intensity strings
        System.out.printf("%nResting Pulse: %s\tAge:%s%n%nIntensity\t| Rate%n------------|--------%n", restingHR, age);

        //output sequence in a for loop [for(int i=55; i<96; i+=5)]
        for(int i = 55; i < 96; i += 5) {
            //output intensity level (i), and output bpm string returned from calling karvonen method with appropriate parameters
            System.out.printf("%d%%\t\t\t| %s bpm%n", i, karvonen(age, restingHR, intensity));

            //raise intensity variable (double) by 0.05 before next loop
            intensity += 0.05;
        }
    }

    //function to test if a string is a number
    public static boolean isNum(String string){
        try{
            //tries to parse the string into a double, returns false if it can't or if it can, but it is 0 or less
            Integer.parseInt(string);
            return Integer.parseInt(string) > 0;
        } catch (NumberFormatException e){
            return false;
        }
    }

    //function that takes in age and pulse
    public static String karvonen(String age, String pulse, double intensity){
        //initialize a decimal formatter to use before returning the string with the result stored in it
        DecimalFormat whole = new DecimalFormat("0");

        //does the math for Karvenon target heart rate using the given parameters on method call
        double targetHR = (((220 - Integer.parseInt(age)) - Integer.parseInt(pulse)) * intensity) + Integer.parseInt(pulse);

        //return the number formatted properly as a string
        return whole.format(targetHR);
    }

    public static String getNumString(String string){
        //initialize input scanner to take input
        Scanner input = new Scanner(System.in);

        //while string is not a number
        while(!isNum(string)) {
            //get user input and store in string variable
            string = input.nextLine();

            //if string is still not a number
            if(!isNum(string)) {
                //output "Please only enter a whole number!\n"
                System.out.println("Please only enter a whole number!");
            }
        }

        //returns the string once the while loop is exited
        return string;
    }
}