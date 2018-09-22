public class PasteColour implements AllColours {


    private double cost;
    private double premiumCost = 25.7;

    @Override
    public void setDensity(int density) {

    }

    @Override
    public int getDensity() {
        return 0;
    }

    @Override
    public boolean premiumCost() {
        if (cost == premiumCost) {
            return true;
        } else
            return false;
    }

    @Override
    public double costPerMeterSquare(int density) {
        double standardCost = 7.4;
        if (density >= 3) {
            cost = premiumCost;
        } else {
            cost = standardCost;
        }
        return cost;
    }
}
