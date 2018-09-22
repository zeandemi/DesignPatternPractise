package MansionComponents;

public class Structure {

    private final int floors;
    private int StructuralCost;

    public Structure(int floors){
        this.floors = floors;
    }


    public int setStructureCost() {
        StructuralCost = floors * 2500;
        return StructuralCost;
    }
}
