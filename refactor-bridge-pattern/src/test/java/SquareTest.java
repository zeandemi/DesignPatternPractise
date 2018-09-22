import org.junit.Assert;
import org.junit.Test;

public class SquareTest {

    Square square = new Square(new WaterColour());

    @Test
    public void testCalculatedArea(){
        square.setDimension(2,2);
        Assert.assertTrue(square.calculatedArea() < 5);
        System.out.println(square.calculatedArea());
    }

    @Test
    public void testCostOfPainting(){
        square.setDimension(1,2);
        square.calculatedArea();
        square.getPaintCost(2);
        Assert.assertEquals("",square.totalCostOfPaint());

    }
}
