public class RegionalCost {

    PriceTag priceTag;
    Outfit outfit;
    RegionalPriceTag usaPriceTag ;
    RegionalPriceTag euroPriceTag;

    public void calculateRegionalCost(String country, int price) {
        usaPriceTag = new UsaPriceTag(outfit);
        euroPriceTag = new EuroPriceTag(outfit);
        priceTag = new PriceTag(0);
        priceTag.setPriceTag(price);
        switch (Continent.valueOf(country)) {
            case America:
                usaPriceTag.setPriceTag(priceTag.getPriceTag());
                usaPriceTag.getPriceTag();
                System.out.println(usaPriceTag.getPriceTag());
                break;
            case Europe:
                usaPriceTag.setPriceTag(priceTag.getPriceTag());
                euroPriceTag.setPriceTag(usaPriceTag.getPriceTag());
                //euroPriceTag.getPriceTag();
                System.out.println(euroPriceTag.getPriceTag());
                break;
        }

    }
}
