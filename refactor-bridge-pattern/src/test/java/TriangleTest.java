import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    Triangle triangle1 = new Triangle(new WaterColour());

    @Test
    public void testCalculatedArea() {
        triangle1.setDimension(2, 2);
        int ExpectedValue = 0;
        int ActualValue = triangle1.calculatedArea();
        Assert.assertTrue(ActualValue > ExpectedValue);

    }

    @Test
    public void testCostOfPaintingAtHigherRate() {
        triangle1.setDimension(4, 6);
        triangle1.calculatedArea();
        triangle1.getPaintCost(2);
        double ActualCost = triangle1.totalCostOfPaint();
        double ExpectedCost = triangle1.rate;
        Assert.assertTrue(ActualCost > ExpectedCost);

    }

    @Test
    public void testCostOfPaintingAtLowerRate() {
        triangle1.setDimension(2, 4);
        triangle1.calculatedArea();
        triangle1.getPaintCost(4);
        double ActualCost = triangle1.totalCostOfPaint();
        double ExpectedCost = triangle1.rate;
        Assert.assertTrue(ActualCost > ExpectedCost);

    }


}
