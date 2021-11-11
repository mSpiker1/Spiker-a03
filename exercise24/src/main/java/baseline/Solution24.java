/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Matthew Spiker
 */

package baseline;
import java.util.Scanner;
import java.util.Arrays;

public class Solution24 {
    //main input/output method
    public static void main(String[] args){
        //Solution24 class reference to call anagramTest with
        Solution24 s24 = new Solution24();

        //initialize two String variables "str1" and "str2", and an input scanner
        Scanner input = new Scanner(System.in);
        String str1;
        String str2;

        //prompt the user to enter two strings
        System.out.print("Enter two strings and I'll tell you if they are anagrams.\nEnter the first string: ");

        //get String str1 and prompt for a second string
        str1 = input.nextLine();
        System.out.print("Enter the second string: ");

        //get String str2
        str2 = input.nextLine();

        //if str1 and str2 are anagrams
        if(s24.isAnagram(str1, str2)) {
            //output that the two strings are anagrams
            System.out.printf("\"%s\" and \"%s\" are anagrams", str1, str2);

            //else output that the two strings are not anagrams
        }else System.out.printf("\"%s\" and \"%s\" are not anagrams", str1, str2);
    }

    //method that returns true if inputs are anagrams, false otherwise
    public boolean isAnagram(String s1, String s2){
        //convert the strings to two char arrays ca1 and ca2
        char[] ca1 = s1.toCharArray();
        char[] ca2 = s2.toCharArray();

        //if ca1.length() does not equal ca2.length()
        if(ca1.length != ca2.length) {
            //return false, they can't be anagrams if they aren't the same length
            return false;
        }

        //sort both of the arrays
        Arrays.sort(ca1);
        Arrays.sort(ca2);

        //for loop to loop through ca1.size() times
        for(int i=0; i<ca1.length; i++) {
            //if ca1[i] is not equal to ca2[i] return false
            if(ca1[i] != ca2[i]) return false;
        }
        //return true if the full method has been passed through
        return true;
    }
}