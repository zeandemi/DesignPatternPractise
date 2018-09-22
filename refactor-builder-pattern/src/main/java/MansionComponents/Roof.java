package MansionComponents;

public class Roof {

    private final String type;
    private int RoofingCost;

    public Roof(String type){
        this.type = type;
    }

    public int setRoofCost() {
        int slatePrice = 2000;
        int aluminiumPrice = 1300;
        switch (type) {
            case "Slates":
                RoofingCost = slatePrice;
                break;
            case "Aluminium":
                RoofingCost = aluminiumPrice;
                break;
        }
        return RoofingCost;
    }
}
