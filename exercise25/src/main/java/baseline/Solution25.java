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
        PassTest pt = new PassTest();

        //create input scanner object
        Scanner input = new Scanner(System.in);

        //prompt user to input a password
        System.out.println("Enter a password to test its strength: ");

        //get password and store in a string "pass"
        String pass = input.nextLine();

        //get the password's score by calling passwordStrength and store it in an int "passStrength"
        int passStrength = pt.passwordStrength(pass);

        //call scoreOut with parameters passStrength and pass to output the passwords score
        pt.scoreOut(passStrength, pass);
    }
}

class PassTest {
    //method to determine password strength from a string
    public int passwordStrength(String password){
        //total score of password
        int passScore = 0;

        //if password length is greater than or equal to 8, add one the the score
        if( password.length() >= 8 ) passScore++;

        //if it contains one numeric digit, add 1 to total score
        if( password.matches("(?=.*[0-9]).*") ) passScore++;

        //if it contains one letter of any case, add 2 to total score
        if( password.matches("(?=.*[a-z A-Z]).*") ) passScore += 2;

        //if it contains one special character, add 1 to total score
        if( password.matches("(?=.*[~!@#$%^&*()_-]).*") ) passScore++;

        //return the passScore integer
        return passScore;
    }

    public void scoreOut(int passStrength, String pass){
        //if passStrength is 1, output very weak
        if(passStrength == 1) System.out.printf("The password '%s' is a very weak password.", pass);
            //else if passStrength is 2, output weak
        else if(passStrength == 2) System.out.printf("The password '%s' is a weak password", pass);
            //else if passStrength = 3, output strong
        else if(passStrength == 3 || passStrength == 4) System.out.printf("The password '%s' is a strong password", pass);
            //else if passStrength is 5, output very strong
        else if(passStrength == 5) System.out.printf("The password '%s' is a very strong password", pass);
            //else output unknown
        else System.out.println("The password has an unknown strength");
    }
}