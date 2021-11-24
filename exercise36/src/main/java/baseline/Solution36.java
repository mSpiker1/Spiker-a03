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
        StatHandler sh = new StatHandler();

        //create decimal formatter for the average later on
        DecimalFormat round = new DecimalFormat("0.##");

        //calls enterStrings to create an array of user inputs
        String[] numArray = enterStrings("Enter a number: ");

        //output all items in the array using arrayOutput method
        arrayOutput(numArray);

        //calls the average, min, max, and std functions to get their results for the user's inputs
        String avg = round.format(sh.average(numArray));
        int minimum = sh.min(numArray);
        int maximum = sh.max(numArray);
        String staDev = round.format(sh.std(numArray, Integer.parseInt(avg)));

        //output the average, min, max, and standard deviation
        System.out.printf("%nThe average is %s%nThe minimum is %d%nThe maximum is %d%nThe standard deviation is %s",
                avg, minimum, maximum, staDev);
    }

    //method to make a string array from user inputs
    public static String[] enterStrings(String prompt){
        //initialize input scanner
        Scanner input = new Scanner(System.in);

        //initialize string "userInput" which is " " by default
        String userInput = " ";

        //initialize n arraylist of strings
        ArrayList<String> arrayList = new ArrayList<>();

        //while userInput does not equal "done"
        while(!userInput.equals("done")){
            //output prompt string
            System.out.print(prompt);

            //store user input in userInput string
            userInput = input.nextLine();

            //if userInput is not equal to "done"
            if(!userInput.equals("done")){
                arrayList.add(userInput);
            }
        }

        //return the arraylist of strings as an array
        return arrayList.toArray(new String[0]);
    }

    //method using a for loop to display all strings in an array
    public static void arrayOutput(String[] array){
        //print pretext
        System.out.print("Numbers: ");

        //for loop to loop through the whole array of strings
        for(int i=0; i<array.length; i++){
            //if not at the end of the array,
            if(i<array.length-1) {
                //output array[i] and a comma
                System.out.print(array[i] + ", ");

                //else output just array[i] string, this is the end of the loop so no comma is needed
            } else System.out.print(array[i]);
        }
    }
}

class StatHandler{
    //method to get the average of a set of numbers (from a string array)
    public double average(String[] array){
        //initialize an integer average equal to 0
        int average = 0;

        //for loop to go through all strings in the array
        for (String s : array) {
            //add array[i]'s number to average
            average += Double.parseDouble(s);
        }

        //after for loop is done, divide average by the length of the array
        average = average / array.length;

        //return average
        return average;
    }

    //method to get the minimum number in an array of strings
    public int min(String[] array){
        //initialize an integer min
        int min = Integer.parseInt(array[1]);

        //for loop to go through each string in the array
        for (String s : array) {
            //if min is greater than the current string's integer
            if (min > Integer.parseInt(s)) {
                //set min to current string's integer
                min = Integer.parseInt(s);
            }
        }

        //return min
        return min;
    }

    //method to get the maximum number in an array of strings
    public int max(String[] array){
        //initialize an integer max
        int max = Integer.parseInt(array[1]);

        //for loop to go through each string in the array
        for (String s : array) {
            //if max is less than the current string's integer
            if (max < Integer.parseInt(s)) {
                //set max to the current string's integer
                max = Integer.parseInt(s);
            }
        }

        //return max
        return max;
    }

    //method to get the standard deviation of an array
    public double std(String[] array, int average){
        //create a new arraylist of strings
        ArrayList<String> arrayList = new ArrayList<>();

        //for loop to go through each string in the array
        for (String s : array) {
            //standard devation calculation (before the average is found) for current string, add to array
            arrayList.add(String.valueOf(Math.pow((Double.parseDouble(s) - average), 2)));
        }

        //get the average of all numbers in the array
        double newavg = average(arrayList.toArray(new String[0]));

        //return the square root of the average of the array
        return Math.sqrt(newavg);
    }
}