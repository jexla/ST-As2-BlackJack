package nz.ac.eit.blackjack;

import org.junit.Assert;
import org.junit.Test;

public class InputNotYesOrNoExceptionTest
{
    @Test
    public void constructor_noParameters_returnsEmptyString()
    {
        InputNotYesOrNoException e = new InputNotYesOrNoException();
        Assert.assertEquals("Creating InputNotYesOrNoException with no parameters should result in an empty string","", e.getText());
    }

    @Test
    public void constructor_emptyString_returnsEmptyString()
    {
        InputNotYesOrNoException e = new InputNotYesOrNoException("");
        Assert.assertEquals("Creating InputNotYesOrNoException with an empty string should result in an empty string","", e.getText());
    }

    @Test
    public void constructor_a_returns_a()
    {
        InputNotYesOrNoException e = new InputNotYesOrNoException("a");
        Assert.assertEquals("Creating InputNotYesOrNoException with the string \"a\" should result in \"a\"","a", e.getText());
    }

    @Test
    public void constructor_abc_returns_abc()
    {
        InputNotYesOrNoException e = new InputNotYesOrNoException("abc");
        Assert.assertEquals("Creating InputNotYesOrNoException with the string \"abc\" should result in \"abc\"","abc", e.getText());
    }
}
