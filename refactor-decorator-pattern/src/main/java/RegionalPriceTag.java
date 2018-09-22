public class RegionalPriceTag implements Outfit {

    private final Outfit outfit;

    public RegionalPriceTag(Outfit outfit){
        this.outfit = outfit;
    }


    @Override
    public void setPriceTag(int price) {

    }

    @Override
    public int getPriceTag() {
        return outfit.getPriceTag();

    }

}
