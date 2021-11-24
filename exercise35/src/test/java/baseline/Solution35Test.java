package baseline;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution35Test {
    @Test
    void randStringTest(){
        //create an arraylist of strings
        ArrayList<String> testList = new ArrayList<>();

        //add 5 strings to the arraylist
        for(int i=0; i<5; i++){
            //create a string from i
            String s = Integer.toString(i);

            //add s to the arraylist
            testList.add(s);
        }

        //create a boolean value set to false
        boolean testValue = false;

        //create a string from calling the randString method using testList
        Solution35 s = new Solution35();
        String testResult = s.randString(testList);

        //loop through each string in the array
        for(int i=0; i<testList.size(); i++){
            //if testResult equals testList[i]
            if(testList.get(i).equals(testResult)){
                //set test value to true and break the loop
                testValue = true;
                break;
            }
        }

        //testValue should be true by now, assert so
        assertTrue(testValue);
    }
}