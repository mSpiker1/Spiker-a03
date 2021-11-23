package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution27Test{
    @Test
    //tests first and last name validation method
    void testFirstAndLast(){
        Validate testNames = new Validate();
        String name1 = "Name";
        String name2 = "a";
        boolean fResult1 = testNames.nameValid(name1);
        boolean fResult2 = testNames.nameValid(name2);
        assertTrue(fResult1);
        assertFalse(fResult2);
    }

    @Test
    //tests the ID validation method
    void testID(){
        Validate testID = new Validate();
        String ID1 = "AA-1234";
        String ID2 = "not an ID";
        boolean result1 = testID.idValid(ID1);
        boolean result2 = testID.idValid(ID2);
        assertTrue(result1);
        assertFalse(result2);
    }

    @Test
    //tests the zip code validation method
    void testZip(){
        Validate testZip = new Validate();
        String zip1 = "123456";
        String zip2 = "not a zip code";
        boolean result1 = testZip.zipValid(zip1);
        boolean result2 = testZip.zipValid(zip2);
        assertTrue(result1);
        assertFalse(result2);
    }

    @Test
    //tests the validateInput method
    void testValidateInput(){
        //create four strings that should match id parameter requirements, one string that breaks requirements of a field
        String first = "First";
        String last = "Last";
        String id = "AA-1234";
        String zip = "123123";
        String badId = "12-ABCD";

        //create strings of expected resulting string messages from the test method
        String good = "There were no errors found.";
        String bad = "The employee ID must be in the format of AA-1234.\n";

        //assert that inputting all correct parameters into validateInput returns a string containing:
        //"There were no errors found."
        assertEquals(good, Validate.validateInput(first, last, zip, id));

        //assert that inputting all correct parameters except id (badID instead) returns a string containing:
        //"The employee ID must be in the format of AA-1234.\n"
        assertEquals(bad, Validate.validateInput(first, last, zip, badId));
    }
}