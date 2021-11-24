/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Matthew Spiker
 */

package baseline;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Solution37 {
    //random number generator object
    private static final Random rand = new Random();

    //main method
    public static void main(String[] args){
        //Solution37 class object
        Solution37 s = new Solution37();

        //initialize input scanner
        Scanner input = new Scanner(System.in);

        //input/ouput sequence to grab variables minLength, specials, numbers from the user
        System.out.print("What's the minimum length? ");
        int minLength = Integer.parseInt(input.nextLine());
        System.out.print("How many special characters? ");
        int specials = Integer.parseInt(input.nextLine());
        System.out.print("How many numbers? ");
        int numbers = Integer.parseInt(input.nextLine());

        //print a password generated from createPassword
        System.out.printf("Your password is %s", s.createPassword(minLength, specials, numbers));
    }

    //method to generate a random password based on user specifications grabbed from main method
    public String createPassword(int minLength, int numSpecial, int numNumbers){
        //create an arraylist of characters
        ArrayList<Character> chars = new ArrayList<>();

        //initialize string of all letters, lower and upper case
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        //initialize string of special characters that can be used
        String specialChar = "!@#$%^&*(){}/.,;'\"?><:=-`~\\|";

        //initialize a string of numbers that can be used
        String numbers = "1234567890";

        //for loop to add random special characters based on user specifications
        for(int i=0; i<numSpecial; i++){
            chars.add(specialChar.charAt(rand.nextInt(specialChar.length())));
        }

        //for loop to add random numbers based on user specifications
        for(int i=0; i<numNumbers; i++){
            chars.add(numbers.charAt(rand.nextInt(numbers.length())));
        }


        //if the minimum length divided by 2 is greater than the number of special and numeric characters combined
        if(minLength/2 > numSpecial + numNumbers) {
            //for loop to add random letters for the rest of the password
            for (int i = chars.size(); i < minLength; i++) {
                chars.add(letters.charAt(rand.nextInt(letters.length())));
            }
            //else if minLength/2 is less than numSpecial + numNumbers
        } else{
            //for loop to add random letters equal to numSpecial + numNumbers' amount of characters
            for(int i=0; i<numSpecial + numNumbers; i++){
                chars.add(letters.charAt(rand.nextInt(letters.length())));
            }
        }

        //shuffles the list of chars
        Collections.shuffle(chars);

        //create string and assign the password from the array list to the string
        StringBuilder pass = new StringBuilder(chars.size());
        for(Character s: chars){
            pass.append(s);
        }

        //return the password string
        return pass.toString();
    }
}