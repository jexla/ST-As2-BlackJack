package nz.ac.eit.blackjack;

import org.junit.Assert;
import org.junit.Test;

public class DiceTest
{
    // The Dice roll method is obviously a hard one to test because the result is random,
    // so I just roll it 100 times and makes sure that all the results are from 1 to 6 (inclusive)
    @Test
    public void roll_returns1to6()
    {
        Dice d = new Dice();
        int[] results = new int[100];
        for (int i = 0; i < 100; i++)
        {
            results[i] = d.roll();
        }
        for (int result : results)
        {
            Assert.assertTrue("Dice roll results should be from 1 to 6 (inclusive)", result >= 1 && result <= 6);
        }
    }
}
