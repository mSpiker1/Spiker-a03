package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution31Test {
    @Test
    void testIsNum(){
        String num1 = "100";
        String num2 = "0";
        boolean result1 = Solution31.isNum(num1);
        boolean result2 = Solution31.isNum(num2);
        assertTrue(result1);
        assertFalse(result2);
    }

    @Test
    void testKarvonen(){
        String testHR = "65";
        String testAge = "22";
        double testIntensity = 0.55;
        int result = Integer.parseInt(Solution31.karvonen(testAge, testHR, testIntensity));
        assertTrue(result == 138);
    }

    //Didn't make a test case for getNumString as it just gets input
}