/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Matthew Spiker
 */

package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution38 {
    //main method
    public static void main(String[] args){
        //Solution38 class object
        Solution38 s = new Solution38();

        //initialize input scanner
        Scanner input = new Scanner(System.in);

        //input/output sequence with user
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String nums = input.nextLine();

        //split the nums variable up into a string array separated by spaces
        String[] numList = nums.split(" ");

        //create another array of type Integer to store even numbers as numList passes through filterEvenNumbers
        Integer[] evenList = s.filterEvenNumbers(numList);

        //pretext for final output
        System.out.print("The even numbers are: ");

        //for loop to output even numbers
        for(int i=0; i<evenList.length; i++){
            //if not at the end of the even array, just output the number and a space
            if(i<evenList.length-1) System.out.print(evenList[i] + " ");
                //else output the number and a period (end of the array, end of output)
            else System.out.print(evenList[i] + ".");
        }
    }

    //function to sort even numbers from a given string array
    public Integer[] filterEvenNumbers(String[] array){
        //create an integer array to use to store the even numbers in the given array
        ArrayList<Integer> evenList = new ArrayList<>();

        //for each string in the array
        for (String s : array) {
            //if the string, when parsed to an integer, is evenly divisible by 2
            if (Integer.parseInt(s) % 2 == 0) {
                //add the string parsed to an integer to the arraylist of even numbers
                evenList.add(Integer.parseInt(s));
            }
        }

        //creates a new Integer array to be returned to the main function, built from the evenList arraylist
        Integer[] evens = new Integer[evenList.size()];
        evens = evenList.toArray(evens);

        //returns the even numbers in an integer array
        return evens;
    }
}