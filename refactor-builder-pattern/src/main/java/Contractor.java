import BuildingTypes.Builder;

public class Contractor {

    Builder builder;

    public Contractor(Builder builder){
        this.builder = builder;

    }

    public int getBuildingCost(){
        builder.setFoundation();
        builder.setStructure(1);
        builder.setRooms(4,false);
        builder.setRoofing(BuildingMaterial.Slates.toString());
        return builder.getTotalCost();
    }

    public int getExecutiveBuildingCost(){
        builder.setFoundation();
        builder.setStructure(3);
        builder.setRooms(6,true);
        builder.setRoofing(BuildingMaterial.Aluminium.toString());
        builder.setFence(100,BuildingMaterial.Block.toString());
        return builder.getTotalCost();
    }

}
