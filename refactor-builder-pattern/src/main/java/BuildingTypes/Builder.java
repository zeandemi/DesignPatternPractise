package BuildingTypes;

public interface Builder {

    void setFence(int plotSize, String type);

    void setFoundation();

    void setStructure(int floors);

    void setRoofing(String type);

    void setRooms(int numberOfRooms, boolean ensuite);

    int getTotalCost();

}

