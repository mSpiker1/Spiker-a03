/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Matthew Spiker
 */

package baseline;
import java.util.Scanner;

public class Solution25 {
    //main input/output method
    public static void main(String[] args){
        //object to reference class passTest

        //create input scanner object

        //prompt user to input a password

        //get password and store in a string "pass"

        //get the password's score by calling passwordStrength and store it in an int "passStrength"

        //call scoreOut with parameters passStrength and pass to output the passwords score
    }
}

class PassTest {
    //method to determine password strength from a string
    public int passwordStrength(String password){
        //total score of password

        //if password length is greater than or equal to 8, add one the the score

        //if it contains one numeric digit, add 1 to total score

        //if it contains one letter of any case, add 2 to total score

        //if it contains one special character, add 1 to total score

        //return the passScore integer
        return 0;
    }

    public void scoreOut(int passStrength, String pass){
        //if passStrength is 1, output very weak
        //else if passStrength is 2, output weak
        //else if passStrength = 3, output strong
        //else if passStrength is 5, output very strong
        //else output unknown
    }
}