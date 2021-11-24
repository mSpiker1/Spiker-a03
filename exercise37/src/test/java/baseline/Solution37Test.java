package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution37Test {
    @Test
    void createPasswordTest(){
        //Solution37 class objects
        Solution37 s = new Solution37();

        //create two sets of password related integers (minlength, numspecial, numnumbers):

        //one set follows numSpecial + numNumbers < minLength/2
        int minLength = 20;
        int numSpecial = 3;
        int numNumbers = 2;

        //one set does not
        int minLen = 20;
        int numSpec = 15;
        int numNum = 5;

        //create two passwords from these two sets of ints, using createPassword method
        String twenty = s.createPassword(minLength, numSpecial, numNumbers);
        String forty = s.createPassword(minLen, numSpec, numNum);

        //assert the lengths of the passwords are as they should be
        assertEquals(20, twenty.length());
        assertEquals(40, forty.length());
    }
}