import org.junit.Assert;
import org.junit.Test;

public class EuroPriceTagTest {

    EuroPriceTag euroPriceTag;
    PriceTag priceTag;
    Outfit outfit;

    @Test
    public void getPriceTagTest(){
        int i = 0;
        priceTag = new PriceTag(i);
        euroPriceTag = new EuroPriceTag(outfit);
        priceTag.setPriceTag(i);
        euroPriceTag.setPriceTag(priceTag.getPriceTag());
        Assert.assertNotNull(euroPriceTag.getPriceTag());
    }
}
