package nz.ac.eit.blackjack;

import org.junit.Assert;
import org.junit.Test;

public class HumanTest
{
    @Test
    public void playSecondRoll_returns2to12()
    {
        Human h = new Human();
        int[] results = new int[100];
        for (int i = 0; i < 100; i++)
        {
            results[i] = h.playSecondRoll();
        }
        for (int result : results)
        {
            Assert.assertTrue("Results should be from 2 to 12 (inclusive)", result >= 2 && result <= 12);
        }
    }

    @Test
    public void playFirstRoll_returns2to12()
    {
        Human h = new Human();
        int[] results = new int[100];
        for (int i = 0; i < 100; i++)
        {
            results[i] = h.playFirstRoll();
        }
        for (int result : results)
        {
            Assert.assertTrue("Results should be from 2 to 12 (inclusive)", result >= 2 && result <= 12);
        }
    }

    @Test
    public void playBothRollsGetTotal_returns4to24()
    {
        int[] results = new int[100];
        for (int i = 0; i < 100; i++)
        {
            Human h = new Human();
            h.playFirstRoll();
            h.playSecondRoll();
            results[i] = h.getScore();
        }
        for (int result : results)
        {
            Assert.assertTrue("Results should be from 4 to 24 (inclusive)", result >= 4 && result <= 24);
        }
    }

}
