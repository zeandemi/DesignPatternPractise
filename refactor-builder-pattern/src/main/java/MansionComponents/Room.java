package MansionComponents;

public class Room {

    private final boolean ensuite;
    private final int numberOfRooms;
    private int FinishingCost;

    public Room(int numberOfRooms, boolean ensuite) {
        this.numberOfRooms = numberOfRooms;
        this.ensuite = ensuite;

    }

    public int setRoomCost() {
        if (ensuite) {
            FinishingCost = getEnSuiteRate(numberOfRooms);
        } else {
            FinishingCost = getStandardRate(numberOfRooms);
        }
        return FinishingCost;
    }

    private int getEnSuiteRate(int numberOfRooms) {
        int costOfEnSuiteRoomUnit = 1200;
        return numberOfRooms * costOfEnSuiteRoomUnit;
    }

    private int getStandardRate(int numberOfRooms) {
        int costOfRoomUnit = 1000;
        return numberOfRooms * costOfRoomUnit;
    }
}
