/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Matthew Spiker
 */

package baseline;
import java.util.Scanner;
import java.util.Random;

//this code is so messy but I've already spent an hour on it and it works so I'm done with it lmao

public class Solution32 {
    //at least the main class is a little more organized than the rest of this code
    public static void main(String[] args){
        //initialize input scanner and variables
        Scanner input = new Scanner(System.in);
        String difficulty;
        String playAgain = "y";

        //input/output setup inside while loop to allow user to play again if they wish
        while(playAgain.equals("Y") || playAgain.equals("y")) {
            System.out.print("Let's play Guess the Number!%n%n");
            difficulty = "-1";
            difficulty = getDifficulty(difficulty);
            numGame(difficulty);
            System.out.println("Would you like to play again? (Y/N): ");
            playAgain = input.nextLine();
        }
    }

    //method to ensure a string is numeric
    public static boolean isNum(String string){
        try{
            //tries to parse the string into a double, returns false if it can't or if it is below 1/above 3
            Integer.parseInt(string);
            return Integer.parseInt(string) >= 0 ;
        } catch (NumberFormatException e){
            return false;
        }
    }

    //method to loop for input until it confirms it is a whole number [uses isNum]
    public static String getNumString(String string){
        //initialize input scanner to take input
        Scanner input = new Scanner(System.in);

        //while loop to keep requesting input until a numeric input is received
        while(!isNum(string)){
            string = input.nextLine();
            if(!isNum(string)) System.out.print("Please only enter a whole number greater than zero! ");
        }

        //returns the string once it is confirmed to be numeric
        return string;
    }

    //method to get the difficulty input from the user
    public static String getDifficulty(String difficulty){
        //while loop to ensure the difficulty entered is 1, 2, or 3
        while(Integer.parseInt(difficulty) > 3 || Integer.parseInt(difficulty) < 1) {
            System.out.print("Enter the difficulty level(1, 2, or 3): ");
            difficulty = getNumString(difficulty);
            if(Integer.parseInt(difficulty) < 1){
                System.out.print("That number is not between 1 and 3. ");
                difficulty = "-1";
            }
            if(Integer.parseInt(difficulty) > 3){
                System.out.print("That number is not between 1 and 3. ");
                difficulty = "-1";
            }
        }
        return difficulty;
    }

    public static void numGame(String difficulty){
        //initialize input scanner, random number , and variables
        final Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int upperBound = (int) Math.pow(10, Integer.parseInt(difficulty));
        int num = rand.nextInt(upperBound);
        int guesses = 0;
        String guess = "1001";

        //input/output loop for the game
        System.out.print("I have my number. What's your guess? ");
        while(Integer.parseInt(guess) != num){
            guess = input.nextLine();
            if(isNum(guess)){
                if(Integer.parseInt(guess) > num) System.out.print("Too high. Guess again: ");
                else if(Integer.parseInt(guess) < num) System.out.print("Too low. Guess again: ");
            } else{
                System.out.print("That is not a number. Guess again: ");
                guess = "1001";
            }
            guesses++;
        }
        if(guesses == 1){
            System.out.println("You got it in 1 guess! Excellent job!");
        } else System.out.printf("You got it in %d guesses!%n", guesses);
    }
}