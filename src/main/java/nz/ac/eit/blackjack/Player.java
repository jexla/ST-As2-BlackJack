package nz.ac.eit.blackjack;

public abstract class Player
{
    protected int score = 0;
    protected Dice dice1 = new Dice();
    protected Dice dice2 = new Dice();

    public int playFirstRoll()
    {
        score = dice1.roll() + dice2.roll();
        return score;
    }

    public int getScore()
    {
        return score;
    }

}
