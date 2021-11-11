package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {
    @Test
    void testPasswordStrength(){
        //class object for passTest
        PassTest testpassStrength = new PassTest();

        //two strings containing two passwords of varying strength
        String veryStrong = "123abc!@#";
        String veryWeak = "123";

        //veryStrong should return 5, veryWeak should return 1
        assertEquals(5, testpassStrength.passwordStrength(veryStrong));
        assertEquals(1, testpassStrength.passwordStrength(veryWeak));
    }
}