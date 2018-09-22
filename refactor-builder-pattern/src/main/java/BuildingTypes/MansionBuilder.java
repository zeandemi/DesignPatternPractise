package BuildingTypes;

public class MansionBuilder implements Builder {

    private int plotSize;
    private String buildingtype;
    private String roofingtype;
    private int floors;
    private int numberOfRooms;
    private boolean enSuite;


    @Override
    public void setFence(int plotSize, String type) {
        this.plotSize = plotSize;
        this.buildingtype = type;
    }

    @Override
    public void setFoundation() {
    }

    @Override
    public void setStructure(int floors) {
        this.floors = floors;
    }

    @Override
    public void setRoofing(String type) {
        this.roofingtype = type;
    }

    @Override
    public void setRooms(int numberOfRooms, boolean enSuite) {
        this.numberOfRooms = numberOfRooms;
        this.enSuite = enSuite;
    }

    @Override
    public int getTotalCost() {
        return getCostOfMansion();
    }


    public int getCostOfMansion() {
        return new Mansion(plotSize, buildingtype, roofingtype, floors, numberOfRooms, enSuite).getCost();
    }

}
