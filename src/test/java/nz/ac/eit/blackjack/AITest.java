package nz.ac.eit.blackjack;

import org.junit.Assert;
import org.junit.Test;

public class AITest
{
    @Test
    public void playSecondRoll_returns2to12orMinus1()
    {
        AI ai = new AI();
        int[] results = new int[100];
        for (int i = 0; i < 100; i++)
        {
            results[i] = ai.playSecondRoll();
        }
        for (int result : results)
        {
            Assert.assertTrue("Results should be from 2 to 12 (inclusive) or -1", (result >= 2 && result <= 12) || result == -1);
        }
    }

    @Test
    public void playFirstRoll_returns2to12()
    {
        AI ai = new AI();
        int[] results = new int[100];
        for (int i = 0; i < 100; i++)
        {
            results[i] = ai.playFirstRoll();
        }
        for (int result : results)
        {
            Assert.assertTrue("Results should be from 2 to 12 (inclusive)", result >= 2 && result <= 12);
        }
    }

    @Test
    public void playBothRollsGetTotal_returns2to24()
    {
        int[] results = new int[100];
        for (int i = 0; i < 100; i++)
        {
            AI ai = new AI();
            ai.playFirstRoll();
            ai.playSecondRoll();
            results[i] = ai.getScore();
        }
        for (int result : results)
        {
            Assert.assertTrue("Results should be from 2 to 24 (inclusive)", result >= 2 && result <= 24);
        }
    }
}
