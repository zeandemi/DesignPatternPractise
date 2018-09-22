import org.junit.Assert;
import org.junit.Test;

public class WaterColourTest {

    WaterColour waterColour = new WaterColour();;

    @Test
    public void testToVerifyStandardRate(){
        waterColour.costPerMeterSquare(2);
        Assert.assertFalse(waterColour.premiumCost());
    }

    @Test
    public void testToVerifyPremiumRate(){
        waterColour.costPerMeterSquare(4);
        Assert.assertTrue(waterColour.premiumCost());
    }
}
