package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution32Test {
    @Test
    void testIsNum(){
        String num1 = "100";
        String num2 = "-1";
        boolean result1 = Solution32.isNum(num1);
        boolean result2 = Solution32.isNum(num2);
        assertTrue(result1);
        assertFalse(result2);
    }
}