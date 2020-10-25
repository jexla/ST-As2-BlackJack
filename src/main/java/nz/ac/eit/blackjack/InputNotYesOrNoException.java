package nz.ac.eit.blackjack;

public class InputNotYesOrNoException extends Exception
{
    private String text;

    public InputNotYesOrNoException(String text) // allows the exception to store what the invalid input was
    {
        this.text = text;
    }

    public InputNotYesOrNoException()
    {
        text = "";
    }

    public String getText()
    {
        return text;
    }
}
