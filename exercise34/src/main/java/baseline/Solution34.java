/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Matthew Spiker
 */

package baseline;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution34 {
    //main method
    public static void main(String[] args){
        //ArrayManager class object
        ArrayManager am = new ArrayManager();

        //create an input scanner
        Scanner input = new Scanner(System.in);

        //create a string array of employee names
        String[] employeeArray = new String[] {"Steve Craft", "Zelda Hyrule", "Pit Icarus", "Alyx Vance", "Aloy Dawn"};

        //use arrayOutput method to output all current employee names
        am.arrayOutput(employeeArray);

        //prompt user for an employee name to remove
        System.out.print("\nEnter an employee name to remove: ");

        //save user input to a string "remove"
        String remove = input.nextLine();

        //use arrayMatch method to get the number in the array that corresponds to user input, or size+1 if none match
        int match = am.arrayMatch(employeeArray, remove);

        //if match is equal to size + 1
        if(match == (employeeArray.length + 1)){
            //tell the user the name does not match, output all employee names again
            System.out.println("That name does not match any names in the database.\n");

            //else
        } else{
            //use removeArray method to remove a name from the employee array
            employeeArray = am.removeArray(employeeArray, match);
        }

        //output the full array
        am.arrayOutput(employeeArray);
    }
}

class ArrayManager{
    //method to remove a string from an array
    public String[] removeArray(String[] array, int remove){
        //convert array to a list of strings
        List<String> list = new ArrayList<>(Arrays.asList(array));

        //remove string #remove from the list
        list.remove(remove);

        //set the array equal to the edited list of strings
        array = list.toArray(new String[0]);

        //return the array
        return array;
    }

    //method using a for loop to display all strings in an array
    public void arrayOutput(String[] array){
        //output how many employees are in the list
        System.out.printf("There are %d employees:%n", array.length);

        //use a for loop to output all employees in the array
        for (String s : array) {
            System.out.print(s + "\n");
        }
    }

    //function to loop through a string array and try to match it with user a user input string
    public int arrayMatch(String[] array, String userInput){
        //use a for loop to go through each string in the array
        for(int i=0; i<array.length; i++){
            //if the user input equals string i from the array
            if(userInput.equals(array[i])){
                //return i
                return i;
            }
        }

        //if the for loop completes, return the length of the array + 1
        return array.length+1;
    }
}