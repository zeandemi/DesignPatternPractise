public class EuroPriceTag extends RegionalPriceTag {


    private Integer interger;


    public EuroPriceTag(Outfit outfit) {
        super(outfit);
    }

    public void setPriceTag(int price) {
        interger = price;
        super.setPriceTag(price);
    }

    public int getPriceTag() {
        Double convertedPrice = priceConverter();
        return convertedPrice.intValue();
    }

    public Double priceConverter() {
        double usaPrice;
        double lowTax = 2.36;
        double highTax = 5.36;
        if (ratesThreshold()) {
            System.out.println(" Using the lower European tax rate");
            usaPrice = lowTax * interger.doubleValue();
        } else {
            System.out.println(" Using the higher European tax rate");
            usaPrice = highTax * interger.doubleValue();
        }
        return usaPrice;
    }

    public Boolean ratesThreshold() {
        Boolean b;
        int threshold = interger;
        b = threshold < 15;
        return b;
    }
}
