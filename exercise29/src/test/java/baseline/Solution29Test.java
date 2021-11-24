package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {
    @Test
    void testIsNum(){
        Solution29 testNum = new Solution29();
        String num1 = "100";
        String num2 = "0";
        boolean result1 = testNum.isNum(num1);
        boolean result2 = testNum.isNum(num2);
        assertTrue(result1);
        assertFalse(result2);
    }

    @Test
    void testYears(){
        Solution29 testYears = new Solution29();
        String year1 = "72";
        String year2 = "80";
        double result1 = testYears.years(year1);
        double result2 = testYears.years(year2);
        assertEquals(1, result1);
        assertEquals(0.9, result2);
    }
}