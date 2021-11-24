/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Matthew Spiker
 */

package baseline;
import java.util.Scanner;
import java.util.Random;

public class Solution33 {
    //create a random object to use in methods in this class
    private static final Random rand = new Random();

    //main method to prompt for, get, and respond to user input
    public static void main(String[] args){
        //initialize input scanner, random number generator, string array for eight ball answers
        Scanner input = new Scanner(System.in);

        //prompt user for a question
        System.out.print("What's your question?\n> ");

        //pass through user input
        input.nextLine();

        //print a string generated from eightBall method
        System.out.print(eightBall());
    }

    //method to generate a random eight ball response string
    public static String eightBall(){
        //create string array of eight ball responses
        String[] eightBall = new String[] {"Yes.", "No.", "Maybe.", "Ask again later."};

        //create an int from the random number generator
        int answer = rand.nextInt(4);

        return eightBall[answer];
    }
}