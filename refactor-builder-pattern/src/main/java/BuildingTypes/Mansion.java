package BuildingTypes;

import MansionComponents.*;

public class Mansion {

    private final int plotSize;
    private final String type;
    private final int floors;
    private final int numberOfRooms;
    private final boolean enSuite;
    private final String roofingtype;
    private int cost;


    public  Mansion(int plotSize, String type, String roofingtype, int floors, int numberOfRooms, boolean ensuite){
        this.plotSize = plotSize;
        this.type = type;
        this.roofingtype = roofingtype;
        this.floors = floors;
        this.numberOfRooms = numberOfRooms;
        this.enSuite = ensuite;
    }

    public int getFenceCost(){
        System.out.println("This is the cost of a mansion fence " + new Fence(plotSize,type).setCost());
         return new Fence(plotSize,type).setCost();
    }

    public int getRoomCost(){
        System.out.println("This is the cost of mansion room " + new Room(numberOfRooms,enSuite).setRoomCost());
        return new Room(numberOfRooms,enSuite).setRoomCost();
    }

    public int getRoofCost(){
        System.out.println("This is the cost of a mansion roof " + new Roof(roofingtype).setRoofCost());
        return new Roof(roofingtype).setRoofCost();
    }

    private int getStructureCost(){
        System.out.println("This is the cost of a mansion structure " + new Structure(floors).setStructureCost());
        return new Structure(floors).setStructureCost();
    }

    private int getFoundationCost(){
        System.out.println("This is the cost of a mansion foundation " + new Foundation().setCost());
        return new Foundation().setCost();
    }

    public int getCost() {
        cost = getFenceCost() + getFoundationCost() + getStructureCost() + getRoofCost() + getRoomCost();
        return cost;
    }

}
