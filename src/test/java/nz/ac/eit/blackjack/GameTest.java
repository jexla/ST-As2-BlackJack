package nz.ac.eit.blackjack;

import org.junit.Assert;
import org.junit.Test;

public class GameTest
{
    @Test
    public void decideWinner_human16AI15_returns1()
    {
        Game g = new Game();
        Assert.assertEquals("Human having higher score than AI should return 1",1, g.decideWinner(16, 15));
    }

    @Test
    public void decideWinner_human15AI16_returnsMinus1()
    {
        Game g = new Game();
        Assert.assertEquals("AI having higher score than human should return -1",-1, g.decideWinner(15, 16));
    }

    @Test
    public void decideWinner_human15AI15_returns0()
    {
        Game g = new Game();
        Assert.assertEquals("human having the same score as AI should return 0",0, g.decideWinner(15, 15));
    }

    @Test
    public void decideWinner_human15AI24_returns1()
    {
        Game g = new Game();
        Assert.assertEquals("AI going over 21 but human not should return 1",1, g.decideWinner(15, 24));
    }

    @Test
    public void decideWinner_human21AI22_returns1()
    {
        Game g = new Game();
        Assert.assertEquals("AI going over 21 but human not should return 1",1, g.decideWinner(21, 22));
    }

    @Test
    public void decideWinner_human24AI15_returns1()
    {
        Game g = new Game();
        Assert.assertEquals("Human going over 21 but AI not should return -1",-1, g.decideWinner(24, 15));
    }

    @Test
    public void decideWinner_human22AI21_returnsMinus1()
    {
        Game g = new Game();
        Assert.assertEquals("Human going over 21 but AI not should return -1",-1, g.decideWinner(22, 21));
    }

    @Test
    public void decideWinner_human21AI21_returns0()
    {
        Game g = new Game();
        Assert.assertEquals("human having the same score as AI should return 0",0, g.decideWinner(21, 21));
    }

    @Test
    public void decideWinner_human22AI22_returns0()
    {
        Game g = new Game();
        Assert.assertEquals("Human and AI both going over 21 should return 0",0, g.decideWinner(22, 22));
    }

    @Test
    public void decideWinner_human23AI23_returns0()
    {
        Game g = new Game();
        Assert.assertEquals("Human and AI both going over 21 should return 0",0, g.decideWinner(23, 23));
    }

    @Test
    public void decideWinner_human22AI23_returns0()
    {
        Game g = new Game();
        Assert.assertEquals("Human and AI both going over 21 should return 0",0, g.decideWinner(22, 23));
    }

    @Test
    public void decideWinner_human23AI22_returns0()
    {
        Game g = new Game();
        Assert.assertEquals("Human and AI both going over 21 should return 0",0, g.decideWinner(23, 22));
    }
}
