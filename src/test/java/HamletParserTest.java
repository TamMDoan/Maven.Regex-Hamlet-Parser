import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testChangeHamletToLeon() {
        String ham = "Hamlet";
        String expected = "Leon";
        HamletParser hp = new HamletParser();

        String actual = hp.hamletToLeon(ham);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testChangeHoratioToTariq() {
        String hor = "Horatio";
        String expected = "Tariq";
        HamletParser hp = new HamletParser();

        String actual = hp.horatioToTariq(hor);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindHoratio() {
        // maybe instead of boolean, this method should return
        // what index the first instance of horatio is at
        String testStr = "This string has Horatio in it.";
        HamletParser hp = new HamletParser();

        Assert.assertTrue(hp.findHoratio(testStr));
    }

    @Test
    public void testFindHamlet() {
        String testStr = "This string has Hamlet in it";
        HamletParser hp = new HamletParser();

        Assert.assertTrue(hp.findHamlet(testStr));
    }
}