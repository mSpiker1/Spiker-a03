package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution34Test {
    @Test
    void matchTest(){
        //ArrayManager class object
        ArrayManager am = new ArrayManager();

        //new array of strings a, b, and c
        String[] array = new String[] {"a", "b", "c"};

        //string containing a matching string from the array
        String goodInput = "b";

        //string containing a non-matching string
        String badInput = "incorrect";

        //get the int returned from goodInput when calling arrayMatch
        int goodResult = am.arrayMatch(array, goodInput);

        //get the int returned from badInput when calling arrayMatch
        int badResult = am.arrayMatch(array, badInput);

        //assert that goodInput returned 1, badInput returned 4 (array.length + 1)
        assertEquals(1, goodResult);
        assertEquals(4, badResult);
    }

    @Test
    void removeTest(){
        //ArrayManager class object
        ArrayManager am = new ArrayManager();

        //new array of strings a, b, and c
        String[] array = new String[] {"a", "b", "c"};

        //assert that the length of array is 3
        assertEquals(3, array.length);

        //remove b from the array
        array = am.removeArray(array, 1);

        //assert that the length of the array is now 2
        assertEquals(2, array.length);
    }
}