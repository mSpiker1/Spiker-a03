/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Matthew Spiker
 */
package baseline;

public class Solution30 {
    public static void main(String[] args){
        //initializes spacer variable, used to determine the length of a number about to be output
        String spacer;

        //top level for loop for the x in x*y, x starts at 1 and loops until x is less than or equal to 12
        for(int i=1; i<=12; i++) {
            //lower level for loop for the y in x*y, y starts at 1 and loops until y is less than or equal to 12
            for (int j = 1; j <= 12; j++) {
                //print the product of x and y plus one blank space
                System.out.print((i * j) + " ");

                //set the value of spacer to the product of x and y as a string
                spacer = String.valueOf(i * j);

                //if the length of the spacer string is 1, print two blank spaces
                if (spacer.length() == 1) System.out.print("  ");
                    //else if the length of the spacer string is 2, print one blank space
                else if (spacer.length() == 2) System.out.print(" ");
            }
            //move to the next line with a blank println statement before looping again
            System.out.println();
        }
    }
}