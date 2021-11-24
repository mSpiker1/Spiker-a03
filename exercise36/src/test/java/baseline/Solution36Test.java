package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution36Test {
    @Test
    void testAvg(){
        //StatHandler class object
        StatHandler sh = new StatHandler();

        String[] testArray = new String[] {"0", "50", "100"};
        double result = sh.average(testArray);
        assertEquals(50, result);
    }

    @Test
    void testMin(){
        //StatHandler class object
        StatHandler sh = new StatHandler();

        String[] testArray = new String[] {"0", "50", "100"};
        int result = sh.min(testArray);
        assertEquals(0, result);
    }

    @Test
    void testMax(){
        //StatHandler class object
        StatHandler sh = new StatHandler();

        String[] testArray = new String[] {"0", "50", "100"};
        int result = sh.max(testArray);
        assertEquals(100, result);
    }

    @Test
    void testStd(){
        //StatHandler class object
        StatHandler sh = new StatHandler();

        String[] testArray = new String[] {"100", "200", "1000", "300"};
        double result = sh.std(testArray, (int) Math.round(sh.average(testArray)));
        assertEquals(353.5533905932738, result);
    }
}