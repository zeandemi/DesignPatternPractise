package MansionComponents;

public class Fence {

    private final int plotSize;
    private final String type;
    private int FenceCost;

    public Fence(int plotSize, String type){
        this.plotSize = plotSize;
        this.type = type;
    }


    public int setCost() {
        int BlockCostPerUnit = 60;
        int BrickCOstPerUnit = 40;
        switch (type) {
            case "Block":
                FenceCost = BlockCostPerUnit * plotSize;
                break;
            case "Brick":
                FenceCost = BrickCOstPerUnit * plotSize;
                break;
        }

        return FenceCost;
    }
}
