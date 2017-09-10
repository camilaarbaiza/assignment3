import org.junit.Assert;

import static org.junit.Assert.*;

public class Assignment3Test {
    @org.junit.Test
    public void displayCurrency() throws Exception {

        double amount = 11.56;
        int dollars = 11;
        int quarters = 2;
        int dimes = 0;
        int nickels = 1;
        int pennies = 1;

        String expected = "Your amount 11.56 consists of 11 dollars 2 quarters 0 dimes 1 nickels and 1 pennies";

        Assert.assertEquals("Error message",expected, Assignment3.displayCurrency(amount, dollars, quarters, dimes, nickels,pennies));

    }
}