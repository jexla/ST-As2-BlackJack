package nz.ac.eit.blackjack;

import java.util.Random;

public class AI extends Player
{
    public int playSecondRoll()
    {
        Random r = new Random();
        if (r.nextBoolean())
        {
            int secondRoll = dice1.roll() + dice2.roll();
            score += secondRoll;
            return secondRoll;
        }
        else
        {
            return -1;
        }
    }
}
