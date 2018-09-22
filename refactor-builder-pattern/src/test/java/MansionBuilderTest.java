import BuildingTypes.Mansion;
import org.junit.Assert;
import org.junit.Test;

public class MansionBuilderTest {

    Mansion mansionBuilder,mansion,mansion1;

    @Test
    public void testCostOfRoom() {
        mansionBuilder = new Mansion(0, null, null, 0,3,true);
        mansion = new Mansion(0,null, null, 0,3,false);
        Assert.assertTrue(mansionBuilder.getRoomCost() > mansion.getRoomCost());
        System.out.println(mansionBuilder.getRoomCost());
        System.out.println(mansion.getRoomCost());
    }

    @Test
    public void testCostOfRoof() {
        mansionBuilder = new Mansion(0, null, BuildingMaterial.Slates.toString(), 0,0,true);
        mansion = new Mansion(0,null, BuildingMaterial.Aluminium.toString(), 0,0,false);
        Assert.assertTrue(mansionBuilder.getRoofCost() > mansion.getRoofCost());
        System.out.println(mansionBuilder.getRoofCost());
        System.out.println(mansion.getRoofCost());
    }


    @Test
    public void testCostOfFence() {
        mansionBuilder = new Mansion(100, BuildingMaterial.Block.toString(), null, 0,0,true);
        mansion = new Mansion(100,BuildingMaterial.Brick.toString(), null, 0,0,false);
        mansion1 = new Mansion(50,BuildingMaterial.Block.toString(), null, 0,0,true);
        int OptionOne = mansionBuilder.getFenceCost();
        int OptionTwo = mansion.getFenceCost();
        int OptionThree = mansion1.getFenceCost();
        Assert.assertTrue(OptionOne > OptionTwo);
        Assert.assertTrue(OptionOne > OptionThree);
        System.out.println(OptionOne);
        System.out.println(OptionTwo);
    }
}
