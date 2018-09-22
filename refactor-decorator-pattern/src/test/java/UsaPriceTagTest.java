import org.junit.Assert;
import org.junit.Test;

public class UsaPriceTagTest {

     UsaPriceTag usaPriceTag;
     Outfit outfit;
     PriceTag priceTag;

     @Test
     public void getUsaPriceTagTest(){
         int i = 0;
         usaPriceTag = new UsaPriceTag(outfit);
         priceTag = new PriceTag(i);
         priceTag.setPriceTag(i);
         usaPriceTag.setPriceTag(priceTag.getPriceTag());
         Assert.assertNotNull(usaPriceTag.getPriceTag());

     }
}
