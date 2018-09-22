import BuildingTypes.MansionBuilder;

public class BuildingEstimateApplication {

    public static void main(String[] args){
        Contractor c1 = setMansionBuilder();
        int cost = c1.getExecutiveBuildingCost();
        System.out.println("Total cost " + cost);
        int cost1 = c1.getBuildingCost();
        System.out.println("Total cost " + cost1);
    }

    public static Contractor setMansionBuilder(){
        MansionBuilder builder = new MansionBuilder();
        Contractor contractor = new Contractor(builder);
        return contractor;
    }
}
