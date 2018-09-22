public class WaterColour implements AllColours {

    private int density;
    private double cost;
    private double premiumCost = 13.5;


    @Override
    public void setDensity(int density) {
        this.density = density;
    }

    @Override
    public int getDensity() {
        return density;
    }

    @Override
    public boolean premiumCost() {
        if (cost == premiumCost) {
            return true;
        } else
            return false;
    }

    @Override
    public double costPerMeterSquare(int paintDensity) {
        double standardCost = 7.4;
        if (paintDensity > 3) {
            cost = premiumCost;
        } else {
            cost = standardCost;
        }
        return cost;
    }

}
