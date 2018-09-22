import org.junit.Assert;
import org.junit.Test;

public class PasteColourTest {

    PasteColour pasteColour = new PasteColour();;

    @Test
    public void testToVerifyStandardRate(){
        pasteColour.costPerMeterSquare(3);
        Assert.assertTrue(pasteColour.premiumCost());
    }
}
