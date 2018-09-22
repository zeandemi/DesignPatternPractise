public class PriceTag implements Outfit {

    private int price;

    public PriceTag(int price){

    }
    @Override
    public void setPriceTag(int price) {
        this.price = price;

    }

    @Override
    public int getPriceTag() {
        return price;
    }
}
