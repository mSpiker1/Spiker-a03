package baseline;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//make sure you use the gradle run task for this unit test, it is broken otherwise for some reason
//I tried for like an hour to fix it but idk what is wrong with it
class Solution24Test{
    @Test
        //Test for isAnagram to ensure that if two strings "add" and "dad" are input that it would return true
        //also ensures that if "add" and "not" are input, it will return false
    void testIsAnagram(){
        //initialize class object for testAnagram
        Solution24 s24 = new Solution24();

        //initialize three strings, two of which are anagrams and one of which is not
        String s1 = "add";
        String s2 = "dad";
        String s3 = "not";

        //test that s1 and s2 are anagrams, but s1 and s3, and s2 and s3 are not
        assertTrue(s24.isAnagram(s1, s2));
        assertFalse(s24.isAnagram(s2, s3));
        assertFalse(s24.isAnagram(s1, s3));
    }
}