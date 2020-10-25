package nz.ac.eit.blackjack;

public class Human extends Player
{
    public int playSecondRoll()
    {
        int secondRoll = dice1.roll() + dice2.roll();
        score += secondRoll;
        return secondRoll;
    }
}
