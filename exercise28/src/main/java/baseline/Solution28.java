/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Matthew Spiker
 */

package baseline;

import java.util.Scanner;

public class Solution28 {
    public static void main(String[] args){
        //initialize input scanner and sum variable
        Scanner input = new Scanner(System.in);
        int sum = 0;

        //for loop to loop 5 times [for(int i=0; i<5; i++)]
        for(int i=0; i!=5; i++){
            System.out.print("Enter a number: ");
            sum += Integer.parseInt(input.nextLine());
        }

        //prints the sum variable
        System.out.printf("The total is %d", sum);
    }
}