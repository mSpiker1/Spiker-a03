package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution38Test {
    @Test
    void filterTest(){
        //Solution38 class object
        Solution38 s = new Solution38();

        //create two string arrays of numbers
        String[] arr1 = {"1", "2", "3", "4", "5"};
        String[] arr2 = {"54", "55", "76", "93", "43", "90"};

        //create two integer arrays of expected outputs when filtering arr1 and arr2
        Integer[] correct1 = {2, 4};
        Integer[] correct2 = {54, 76, 90};

        //create two integer arrays from using the filterEvenNumbers method on arr1 and arr2
        Integer[] result1 = s.filterEvenNumbers(arr1);
        Integer[] result2 = s.filterEvenNumbers(arr2);

        //assert that each array is correct
        assertEquals(correct1[0], result1[0]);
        assertEquals(correct1[1], result1[1]);
        assertEquals(correct2[0], result2[0]);
        assertEquals(correct2[1], result2[1]);
        assertEquals(correct2[2], result2[2]);
    }
}