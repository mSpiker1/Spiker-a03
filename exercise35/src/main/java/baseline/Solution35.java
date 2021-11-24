/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Matthew Spiker
 */

package baseline;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Solution35 {
    //create a random object
    private final Random rand = new Random();

    public static void main(String[] args){
        //Solution35 class object
        Solution35 s = new Solution35();

        //initialize input scanner
        Scanner input = new Scanner(System.in);

        //create a new string "name"
        String name = " ";

        //initialize a contestant arraylist
        ArrayList<String> contestants = new ArrayList<>();

        //while loop to prompt for and grab input until the name string is blank
        while(!name.equals("")){
            //prompt for user input
            System.out.print("Enter a name: ");

            //get user input and store in name string
            name = input.nextLine();

            //if name is not blank
            if(!name.equals("")) {
                //add the name to the contestant arraylist
                contestants.add(name);
            }
        }

        //output the string returned from randString when contestants arraylist is given as a parameter
        System.out.printf("The winner is... %s", s.randString(contestants));
    }

    //randomly picks a string from an array
    public String randString(List<String> stringList){
        //create a string "selected"
        String selected;

        //set selected to a randomly picked string from the arraylist
        selected = stringList.get(rand.nextInt(stringList.size()));

        //return the randomly selected string
        return selected;
    }
}