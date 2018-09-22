
public class UsaPriceTag extends RegionalPriceTag {

    Integer integer;


    public UsaPriceTag(Outfit outfit) {
        super(outfit);
    }


    public void setPriceTag(int price) {
        integer = price;
        super.setPriceTag(price);
    }

    public int getPriceTag() {
        Double convertedPrice = priceConverter();
        return convertedPrice.intValue();
    }

    private Double priceConverter() {
        double usaPrice;
        double rate = 1.38;
        usaPrice =  rate * integer.doubleValue();
        return usaPrice;
    }
}
