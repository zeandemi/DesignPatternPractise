public class Square implements AllShapes {

    private AllColours allColours;
    private int breadth;
    private int length;
    private int area;
    double rate;


    public Square(AllColours allColours) {
        this.allColours = allColours;
    }

    @Override
    public double totalCostOfPaint() {
        boolean shapeAndPaint = area > 5 && checkPaintQuality();
        double cost;
        if (shapeAndPaint) {
            cost = area * rate;
            System.out.println(" Total cost to paint this shape is " + cost);
            System.out.println(" Calculation is area " + area + " multiple by  premium rate " + rate);
        } else {
            cost = area * rate;
            System.out.println(" Total cost to paint this shape is " + cost);
            System.out.println(" Calculation is area " + area + " multiple by  standard rate " + rate);
        }
        return cost;
    }

    @Override
    public void setDimension(int firstValue, int secondValue) {
        this.length = firstValue;
        this.breadth = secondValue;

    }

    @Override
    public int calculatedArea() {
        area = length * breadth;
        return area;
    }

    public double getPaintCost(int paintDensity) {
        allColours.setDensity(paintDensity);
        rate = allColours.costPerMeterSquare(allColours.getDensity());
        return rate;
    }

    public boolean checkPaintQuality() {
        return allColours.premiumCost();
    }

}
