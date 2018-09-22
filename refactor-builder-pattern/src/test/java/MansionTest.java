import BuildingTypes.Mansion;
import org.junit.Assert;
import org.junit.Test;

public class MansionTest {

    Mansion mansion;

    @Test
    public void getMansionCost(){
        mansion = new Mansion(100,BuildingMaterial.Block.toString(), BuildingMaterial.Aluminium.toString(), 2,4,true);
        Assert.assertNotNull(mansion.getCost());
    }
}
