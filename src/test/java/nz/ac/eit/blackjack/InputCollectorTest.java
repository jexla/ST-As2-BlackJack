package nz.ac.eit.blackjack;

import org.junit.Assert;
import org.junit.Test;

public class InputCollectorTest
{
    @Test
    public void collectYesOrNo_yes_returnsTrue()
    {
        InputCollector ic = new InputCollector();
        try
        {
            Assert.assertEquals("The string \"yes\" should return true", true, ic.collectYesOrNo("yes"));
        }
        catch (InputNotYesOrNoException e)
        {
            Assert.fail(e.getText());
        }
    }

    @Test
    public void collectYesOrNo_Yes_returnsTrue()
    {
        InputCollector ic = new InputCollector();
        try
        {
            Assert.assertEquals("The string \"Yes\" should return true", true, ic.collectYesOrNo("Yes"));
        }
        catch (InputNotYesOrNoException e)
        {
            Assert.fail(e.getText());
        }
    }

    @Test
    public void collectYesOrNo_y_returnsTrue()
    {
        InputCollector ic = new InputCollector();
        try
        {
            Assert.assertEquals("The string \"y\" should return true", true, ic.collectYesOrNo("y"));
        }
        catch (InputNotYesOrNoException e)
        {
            Assert.fail(e.getText());
        }
    }

    @Test
    public void collectYesOrNo_Y_returnsTrue()
    {
        InputCollector ic = new InputCollector();
        try
        {
            Assert.assertEquals("The string \"Y\" should return true", true, ic.collectYesOrNo("Y"));
        }
        catch (InputNotYesOrNoException e)
        {
            Assert.fail(e.getText());
        }
    }

    @Test
    public void collectYesOrNo_no_returnsFalse()
    {
        InputCollector ic = new InputCollector();
        try
        {
            Assert.assertEquals("The string \"no\" should return true", false, ic.collectYesOrNo("no"));
        }
        catch (InputNotYesOrNoException e)
        {
            Assert.fail(e.getText());
        }
    }

    @Test
    public void collectYesOrNo_No_returnsFalse()
    {
        InputCollector ic = new InputCollector();
        try
        {
            Assert.assertEquals("The string \"No\" should return true", false, ic.collectYesOrNo("No"));
        }
        catch (InputNotYesOrNoException e)
        {
            Assert.fail(e.getText());
        }
    }

    @Test
    public void collectYesOrNo_n_returnsFalse()
    {
        InputCollector ic = new InputCollector();
        try
        {
            Assert.assertEquals("The string \"n\" should return true", false, ic.collectYesOrNo("n"));
        }
        catch (InputNotYesOrNoException e)
        {
            Assert.fail(e.getText());
        }
    }

    @Test
    public void collectYesOrNo_N_returnsFalse()
    {
        InputCollector ic = new InputCollector();
        try
        {
            Assert.assertEquals("The string \"N\" should return true", false, ic.collectYesOrNo("N"));
        }
        catch (InputNotYesOrNoException e)
        {
            Assert.fail(e.getText());
        }
    }

    @Test(expected = InputNotYesOrNoException.class)
    public void collectYesOrNo_emptyString_throwsInputNotYesOrNoException() throws InputNotYesOrNoException
    {
        InputCollector ic = new InputCollector();
        ic.collectYesOrNo("");
        Assert.fail("Empty string should fail");
    }

    @Test(expected = InputNotYesOrNoException.class)
    public void collectYesOrNo_g_throwsInputNotYesOrNoException() throws InputNotYesOrNoException
    {
        InputCollector ic = new InputCollector();
        ic.collectYesOrNo("g");
        Assert.fail("g should fail");
    }

    @Test(expected = InputNotYesOrNoException.class)
    public void collectYesOrNo_1_throwsInputNotYesOrNoException() throws InputNotYesOrNoException
    {
        InputCollector ic = new InputCollector();
        ic.collectYesOrNo("1");
        Assert.fail("1 should fail");
    }

    @Test(expected = InputNotYesOrNoException.class)
    public void collectYesOrNo_true_throwsInputNotYesOrNoException() throws InputNotYesOrNoException
    {
        InputCollector ic = new InputCollector();
        ic.collectYesOrNo("true");
        Assert.fail("true should fail");
    }

}
