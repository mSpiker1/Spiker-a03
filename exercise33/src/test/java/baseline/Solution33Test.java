package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution33Test {
    @Test
    void eightBallTest(){
        //create string array of the possible responses from the eightBall method
        String[] testArray = new String[] {"Yes.", "No.", "Maybe.", "Ask again later."};

        //create a boolean that is false by default
        boolean testBool = false;

        //set a string equal to the eightBall method's output
        String eightBallOut = Solution33.eightBall();

        //for loop to loop 4 times in order to test each possibly eightBall string
        for(int i=0; i<4; i++) {
            //if statement to call eightBall method, if the returned string is equal to any of the testArray strings,
            //change testBool's value to true
            if (eightBallOut.equals(testArray[i])) {
                testBool = true;
                break;
            }
        }

        //testBool should be true by now, assert that testBool is true
        assertTrue(testBool);
    }
}