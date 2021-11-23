package baseline;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Solution26Test extends Solution26{
    //test for calculateMonthsUntilPaidOff
    @Test
    void calculateMonthsUntilPaidOffTest(){
        //PaymentCalculator class object
        PaymentCalculator pc = new PaymentCalculator();

        //create three double values of the example user input from the assignment
        double dailyRate = (12 * 0.01) / 365;
        double balance = 5000;
        double monPay = 100;

        //create a string that stores the result of the test method using the double parameters
        String testMonths = pc.calculateMonthsUntilPaidOff(dailyRate, balance, monPay);

        //assert that testMonths equals "70"
        assertEquals("70", testMonths);
    }

    //test for formatMonths method
    @Test
    void formatMonthsTest(){
        //PaymentCalculator class object
        PaymentCalculator pc = new PaymentCalculator();

        //create a double to test, equal to a large decimal that should be rounded up
        double s = 9.00000000001;

        //create a new string that stores the result of the test method using the previous string as its parameter
        String testString = pc.formatMonths(s);

        //test that testString is equal to "10"
        assertEquals("10", testString);
    }
}