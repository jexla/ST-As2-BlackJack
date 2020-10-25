package nz.ac.eit.blackjack;

public class Game
{
    public int decideWinner(int humanScore, int aiScore)
    {
        if (humanScore > 21)
        {
            if (aiScore > 21)
            {
                return 0; // if the human and the AI both go over 21
            }
            return -1; // if the human goes over 21 but the AI does not
        }
        if (aiScore > 21)
        {
            return 1; // if the AI goes over 21 but the human does not
        }
        if (humanScore > aiScore)
        {
            return 1; // if the human score is higher than the AI score and both scores are 21 or less
        }
        if (aiScore > humanScore)
        {
            return -1; // if the AI score is higher than the human score and both scores are 21 or less
        }
        return 0; // if the human score is the same as the AI score and both scores are 21 or less
    }
}
