package nz.ac.eit.blackjack;

public class InputCollector
{
    public boolean collectYesOrNo(String input) throws InputNotYesOrNoException
    {
        char choice;
        try
        {
            choice = input.toLowerCase().charAt(0); // takes the first character of the input string and converts it to lowercase
        }
        catch (StringIndexOutOfBoundsException e) // if the user enters an empty string
        {
            throw new InputNotYesOrNoException();
        }
        switch (choice)
        {
            case 'y':
                return true;
            case 'n':
                return false;
            default: // if the first character is not 'y' or 'n'
                throw new InputNotYesOrNoException(input);
        }
    }
}
